package at.example;

import at.example.enums.DifficultyCategory;
import at.example.enums.FinalAlertCategory;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class CustomSignalJSON {

    public String routeName = "default";
    public FinalAlertCategory category = FinalAlertCategory.E1;
    public DifficultyCategory difficulty = DifficultyCategory.CASUAL;
    private JSONObject jsonObject;
    Map<String, Integer> weatherConditions = new HashMap<>();

    CustomSignalJSON() {
        weatherConditions.put("W", 0); // wind
        weatherConditions.put("F", 0); // fog
        weatherConditions.put("T", 0); // temperature
        weatherConditions.put("R", 0); // rain/storm
        weatherConditions.put("A", 0); // avalanche risk
        importJsonData();
    }

    public int getWindLevel() {
        return weatherConditions.get("W");
    }

    public int getFogLevel() {
        return weatherConditions.get("F");
    }

    public int getTemperatureLevel() {
        return weatherConditions.get("T");
    }

    public int getRainLevel() {
        return weatherConditions.get("R");
    }

    public int getAvalancheLevel() {
        return weatherConditions.get("A");
    }

    public void setCondition(String key, Integer value) {
        weatherConditions.put(key, value);
    }

    public Integer getCondition(String key) {
        return weatherConditions.get(key);
    }

    public void importJsonData() {
        /*
         * there is a better way to do it
         * i just couldnt care to look for it
         * im sorry if u have to read this
         * */
        JSONParser parser = new JSONParser();
        try(FileReader reader = new FileReader("data/signals.json")) {
            Object obj = parser.parse(reader);
            jsonObject = (JSONObject) obj;
        } catch (FileNotFoundException | ParseException fileNotFoundException) {
            System.out.println(fileNotFoundException);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void assessThreat(String alert) {
        /*
         * im truly sorry.
         * may god have mercy upon you.
         * */
        JSONArray categories = (JSONArray) jsonObject.get("categories");
        JSONObject currentObject = new JSONObject();
        boolean matched = false;
        for(Object category : categories) {
            JSONObject cat = (JSONObject) category;
            if(cat.get("label").equals(alert)) {
                JSONArray conditions = (JSONArray) cat.get("conditions");
                for(Object condition : conditions) {
                    JSONObject conditionObj = (JSONObject) condition;
                    Long diff = (Long) conditionObj.get("difficulty");
                    if(DifficultyCategory.values()[(int) (diff-1)] == this.difficulty) currentObject = conditionObj;
                }
            }
        }

        // check if conditions matches current threat level
        if(this.getCondition("W") >= (Long)currentObject.get("minWindLv") &&
                this.getCondition("F") >= (Long)currentObject.get("minFogLv") &&
                this.getCondition("T") >= (Long)currentObject.get("minTemperatureLv") &&
                this.getCondition("R") >= (Long)currentObject.get("minRainLv") &&
                this.getCondition("A") >= (Long)currentObject.get("minAvalancheLv")) {
            switch(alert) {
                case "E5": this.category = FinalAlertCategory.E5; break;
                case "E4": this.category = FinalAlertCategory.E4; break;
                case "E3": this.category = FinalAlertCategory.E3; break;
                case "E2": this.category = FinalAlertCategory.E2; break;
                case "E1": this.category = FinalAlertCategory.E1; break;
            }
            matched = true;
        }
        System.out.printf("[%s] Matching input for alert %s: %s.%n", CustomSignalJSON.class.getSimpleName(), alert, matched ? "SUCCESS" : "FAILURE");
    }

    public void recalculateFinalAlert() {
        System.out.printf("[%s] Attempting to recalculate final alert.%n", CustomSignalJSON.class.getSimpleName());
        /*
         * as default, threat is E1.
         * assess if it's a threat of a higher level.
         * if actual alert category (threat lv) did not increase, there's no need to calculate
         * other levels
         *
         * feel free to refactor.
         * i really don't care.
         * */
        assessThreat("E2");
        if(this.category == FinalAlertCategory.E2) assessThreat("E3");
        if(this.category == FinalAlertCategory.E3) assessThreat("E4");
        if(this.category == FinalAlertCategory.E4) assessThreat("E5");
    }

    @Override
    public String toString() {
        /*
         * feel free to refactor it as an actual json object
         * instead of doing this.
         * i don't have time or energy to work with that.
         * */
        return String.format(
                """
                {
                    "routeName": "%s",
                    "routeDifficulty": "%s",
                    "alert": {
                        "label": "%s",
                        "color": "%s",
                        "threatLevel": "%s",
                    },
                    "conditions": {
                        "wind": %d,
                        "fog": %d,
                        "temperature": %d,
                        "rain": %d,
                        "avalancheRisk": %d
                    }
                }
                """,
                routeName,
                difficulty,
                category,
                category.getLabel(),
                category.getDescription(),
                weatherConditions.get("W") == -1 ? 0 : weatherConditions.get("W"),
                weatherConditions.get("F") == -1 ? 0 : weatherConditions.get("F"),
                weatherConditions.get("T") == -1 ? 0 : weatherConditions.get("T"),
                weatherConditions.get("R") == -1 ? 0 : weatherConditions.get("R"),
                weatherConditions.get("A") == -1 ? 0 : weatherConditions.get("A"));
    }

    public void export() {
        // sprawdzanie czy folder output istnieje Panie kolego
        try {
            Files.createDirectories(Paths.get("output"));
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // pobieranie bieżącej daty i godziny Panie kochany
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd_MM_yyyy_HHmmss");
        String timestamp = now.format(formatter);

        String fileName = "output/" + timestamp + ".json";

        try (FileWriter file = new FileWriter(fileName)) {
            file.write(this.toString());
            System.out.println("JSON został zapisany do pliku: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CustomSignalJSON customSignalJSON = new CustomSignalJSON();

        System.out.println(customSignalJSON.toString());

        customSignalJSON.export();
    }
}
