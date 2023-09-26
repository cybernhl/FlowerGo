package inventory;

import plant.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class InventoryService {
    List<Flower> flower = new ArrayList<>(
    );
    List<Fertilizer> fertilizer = new ArrayList<>(
    );
    List<Seed> seed = new ArrayList<>(
    );
    private final Inventory inventory = new Inventory(
            flower,
            seed,
            fertilizer
    );

    public Inventory getInventory() {
        return inventory;
    }
}
