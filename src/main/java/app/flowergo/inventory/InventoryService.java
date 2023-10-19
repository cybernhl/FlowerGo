package app.flowergo.inventory;

import app.flowergo.plant.*;

import java.util.List;

public class InventoryService {

    private Inventory inventory = new Inventory(
            List.of(
                    new Seed(FlowerType.ASTER, Color.YELLOW),
                    new Seed(FlowerType.CARNATION, Color.RED),
                    new Seed(FlowerType.DAISY, Color.BLUE)
            ),
            List.of(
                    new Fertilizer(FertilizerType.ORGANIC)
            )
    );

    public Inventory getInventory() {
        return inventory;
    }

    public void updateInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
