package app.flowergo.plant;

public enum SunshineLevel {
    NONE(0), // Represents no sunshine
    LOW(1), // Represents low sunshine level
    MODERATE(2), // Represents moderate sunshine level
    HIGH(3), // Represents high sunshine level
    INTENSE(4); // Represents intense sunshine

    private final int level;

    private SunshineLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
