package at.example.enums;

public enum DifficultyCategory {
    CASUAL(1),
    INTERMEDIATE(2),
    ADVANCED(3),
    EXPERT(4);
    private int val;
    private DifficultyCategory(int val) {}
    public int getNumericValue() {return val;}

    @Override
    public String toString() {
        return super.toString();
    }
}
