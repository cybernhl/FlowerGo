package plant;

public enum FertilizerType {
    ORGANIC("Organic Fertilizer"),
    CHEMICAL("Chemical Fertilizer"),
    NITROGEN("Nitrogen-Rich Fertilizer"),
    PHOSPHOROUS("Phosphorous-Rich Fertilizer"),
    POTASSIUM("Potassium-Rich Fertilizer"),
    SLOW_RELEASE("Slow-Release Fertilizer");

    private final String description;

    private FertilizerType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
