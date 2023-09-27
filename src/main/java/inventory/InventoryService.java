package inventory;

import plant.*;

import java.util.List;

public class InventoryService {

    private Inventory inventory = new Inventory(
            List.of(
                    new Seed(FlowerType.ASTER)
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
