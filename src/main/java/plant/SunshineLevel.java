package plant;

public enum SunshineLevel {
    NONE(0), // Represents no sunshine
    LOW(1), // Represents low sunshine level
    PARTIAL(2), // Represents partial sunshine
    MODERATE(3), // Represents moderate sunshine level
    HIGH(4), // Represents high sunshine level
    INTENSE(5); // Represents intense sunshine

    private final int level;

    private SunshineLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}

