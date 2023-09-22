package plant;

public enum GrowthLevel {
    SEED(1), // Represents the initial seed stage
    SPROUT(2), // Represents the sprout stage
    BUD(3), // Represents the bud stage
    FLOWER(4), // Represents the flowering stage
    FULL_BLOOM(5), // Represents full bloom stage
    SEEDS(6); // Represents the stage of having seeds

    private final int level;

    private GrowthLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}


