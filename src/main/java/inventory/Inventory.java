package inventory;

import plant.Fertilizer;
import plant.Flower;
import plant.Seed;

import java.util.List;

public record Inventory(
        List<Flower> flowerList,
        List<Seed> seedList,
        List<Fertilizer> fertilizerList
) { }
