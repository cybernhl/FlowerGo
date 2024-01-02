package app.flowergo.plant;

import java.time.Instant;

public record Flower(
        int row,
        int col,
        FlowerType flowerType,
        Color color,
        GrowthLevel growthLevel,
        WaterLevel waterLevel,
        SunshineLevel sunshineLevel,
        Instant lastFertilized,
        FertilizerType fertilizerType
) {
}