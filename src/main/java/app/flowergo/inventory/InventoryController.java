package app.flowergo.inventory;

import app.flowergo.plant.Color;
import app.flowergo.plant.FlowerType;
import app.flowergo.plant.Seed;
import io.javalin.http.Context;

public class InventoryController {
    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    public void getInventory(Context ctx) throws InterruptedException {
        Thread.sleep(1000);
        ctx.json(inventoryService.getInventory());
    }

    public void updateInventory(Context ctx) {
        Inventory inventory = ctx.bodyAsClass(Inventory.class);
        inventoryService.updateInventory(inventory);
    }

    public Seed getSeedFromInventory() {
        FlowerType flowerType = getSeedFromInventory().flowerType();
        Color color = getSeedFromInventory().color();
        Seed getSeed = inventoryService.getSeedFromInventory(flowerType, color);
        return getSeed;
    }
}
