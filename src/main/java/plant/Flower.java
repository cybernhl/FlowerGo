package plant;

import java.time.Instant;

public record Flower(
        FlowerType flowerType,
        Color color,
        GrowthLevel growthLevel,
        WaterLevel waterLevel,
        SunshineLevel sunshineLevel,
        Instant lastFertilized
) { }
