package app.flowergo.inventory;

import app.flowergo.plant.Fertilizer;
import app.flowergo.plant.Seed;

import java.util.List;

public record Inventory(
        List<Seed> seedList,
        List<Fertilizer> fertilizerList
) {

}
