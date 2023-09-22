package plant;

import java.time.Instant;

public record Flower(
        String name,
        String type,
        Color color,
        GrowthLevel growthLevel,
        WaterLevel waterLevel,
        SunshineLevel sunshineLevel,
        Instant lastFertilized
) { }
