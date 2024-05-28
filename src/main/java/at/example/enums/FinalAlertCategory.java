package at.example.enums;

public enum FinalAlertCategory {
    E1(1, "green", "low"),
    E2(2, "yellow", "medium"),
    E3(3, "orange", "increased"),
    E4(4, "red", "high"),
    E5(5, "black", "critical");

    FinalAlertCategory(int _val, String _label, String _description) {
        this.value = _val;
        this.label = _label;
        this.description = _description;
    }

    private int value;
    private String label;
    private String description;

    public String getLabel() {
        return label;
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.name().toUpperCase();
    }
}
