package app.flowergo.inventory;

import app.flowergo.plant.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class InventoryService {

    private Inventory inventory = new Inventory(
            new ArrayList<>(List.of(
                    new Seed(FlowerType.ASTER, Color.YELLOW),
                    new Seed(FlowerType.CARNATION, Color.RED),
                    new Seed(FlowerType.DAISY, Color.BLUE)
            )),
            new ArrayList<>(List.of(
                    new Fertilizer(FertilizerType.ORGANIC)
            ))
    );

    public Inventory getInventory() {
        return inventory;
    }

    public Seed removeSeedFromInventory(FlowerType type, Color color){
        for (int i = 0; i < inventory.seedList().size(); i++){
            Seed seed = inventory.seedList().get(i);
            if (seed.color() == color && seed.flowerType() == type){
                Seed removedSeed = inventory.seedList().remove(i);
                return removedSeed;
            }
        }
        return null;
    }

    public void updateInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
