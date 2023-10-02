package app.flowergo.inventory;

import io.javalin.http.Context;

public class InventoryController {
    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    public void getInventory(Context ctx) {
        ctx.json(inventoryService.getInventory());
    }

    public void updateInventory(Context ctx) {
        Inventory inventory = ctx.bodyAsClass(Inventory.class);
        inventoryService.updateInventory(inventory);
    }
}
