package plant;

public enum WaterLevel {
    DRY(1), // Represents dry soil
    SLIGHTLY_MOIST(2), // Represents slightly moist soil
    MOIST(3), // Represents moist soil
    DAMP(4), // Represents damp soil
    WET(5); // Represents wet soil

    private final int level;

    private WaterLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
