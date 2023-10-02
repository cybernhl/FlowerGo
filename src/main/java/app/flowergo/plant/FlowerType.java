package app.flowergo.plant;

public enum FlowerType {
    ROSE(1),
    TULIP(2),
    DAISY(3),
    LILY(4),
    SUNFLOWER(5),
    ORCHID(6),
    CARNATION(7),
    IRIS(8),
    HYACINTH(9),
    PEONY(10),
    POPPY(11),
    MARIGOLD(12),
    PANSY(13),
    ZINNIA(14),
    ASTER(15),
    COSMOS(16),
    CHERRY_BLOSSOM(17),
    TIGER_LILY(18),
    HIBISCUS(19),
    FORGET_ME_NOT(20);

    private final int identifier;

    private FlowerType(int identifier) {
        this.identifier = identifier;
    }

    public int getIdentifier() {
        return identifier;
    }
}
