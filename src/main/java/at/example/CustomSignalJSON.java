package at.example;

import java.util.HashMap;
import java.util.Map;

public class CustomSignalJSON {

    public String routeName = "default";
    private FinalAlertCategory category = FinalAlertCategory.E1;
    public String difficulty = "";
    Map<String, Integer> weatherConditions = new HashMap<>();

    CustomSignalJSON() {
        weatherConditions.put("W", 0); // wind
        weatherConditions.put("F", 0); // fog
        weatherConditions.put("T", 0); // temperature
        weatherConditions.put("R", 0); // rain/storm
        weatherConditions.put("A", 0); // avalanche risk
    }

    @Override
    public String toString() {
        return String.format(
                """
                {
                    "routeName": "%s",
                    "routeDifficulty": "%s",
                    "alert": %s,
                    "conditions": {
                        "wind": %d,
                        "fog": %d,
                        "temperature": %d,
                        "rain": %d,
                        "avalancheRisk": %d
                    }
                }
                """,
                routeName, difficulty, category,
                weatherConditions.get("W"),
                weatherConditions.get("F"),
                weatherConditions.get("T"),
                weatherConditions.get("R"),
                weatherConditions.get("A"));
    }
}

enum FinalAlertCategory {
    E1(1),
    E2(2),
    E3(3),
    E4(4),
    E5(5);

    FinalAlertCategory(int _val) {
        this.value = _val;
    }

    private int value;

    @Override
    public String toString() {
        return this.name().toUpperCase();
    }
}
