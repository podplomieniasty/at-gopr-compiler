package at.example;

import at.example.enums.DifficultyCategory;
import at.example.enums.FinalAlertCategory;

import java.util.HashMap;
import java.util.Map;

public class CustomSignalJSON {

    public String routeName = "default";
    public FinalAlertCategory category = FinalAlertCategory.E5;
    public DifficultyCategory difficulty = DifficultyCategory.CASUAL;
    Map<String, Integer> weatherConditions = new HashMap<>();

    CustomSignalJSON() {
        weatherConditions.put("W", 0); // wind
        weatherConditions.put("F", 0); // fog
        weatherConditions.put("T", 0); // temperature
        weatherConditions.put("R", 0); // rain/storm
        weatherConditions.put("A", 0); // avalanche risk
    }

    public void recalculateFinalAlert() {

        // analyze all the possibilities
        FinalAlertCategory alert = FinalAlertCategory.E5;
        // we go top down as the paper says
        System.out.println(difficulty);
        switch(this.difficulty) {
            case CASUAL -> {
                if(weatherConditions.get("F") < 3) alert = FinalAlertCategory.E4;
                if(alert == FinalAlertCategory.E4 && weatherConditions.get("R") < 3) alert = FinalAlertCategory.E3;
                if(alert == FinalAlertCategory.E3 && weatherConditions.get("W") < 3) alert = FinalAlertCategory.E2;
                if(alert == FinalAlertCategory.E2 && weatherConditions.get("A") < 4) alert = FinalAlertCategory.E1;
            }
            case INTERMEDIATE -> {
                if(weatherConditions.get("T") < 3) alert = FinalAlertCategory.E4;
                if(alert == FinalAlertCategory.E4 && weatherConditions.get("R") < 3) alert = FinalAlertCategory.E3;
                if(alert == FinalAlertCategory.E3 && weatherConditions.get("F") < 3) alert = FinalAlertCategory.E2;
                if(alert == FinalAlertCategory.E2 && weatherConditions.get("W") < 3 && weatherConditions.get("A") < 4) alert = FinalAlertCategory.E1;
            }
        }
        this.category = alert;
    }

    @Override
    public String toString() {
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
                weatherConditions.get("W"),
                weatherConditions.get("F"),
                weatherConditions.get("T"),
                weatherConditions.get("R"),
                weatherConditions.get("A"));
    }
}


