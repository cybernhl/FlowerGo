package app.flowergo.plant;

import app.flowergo.inventory.Inventory;
import app.flowergo.inventory.InventoryService;
import io.javalin.http.Context;

public class PlantController {
    private final PlantService plantService;
    public InventoryService inventoryService;

    public PlantController(PlantService plantService) {
        this.plantService = plantService;
    }

    public void plantFlowers(Context ctx) {
        Seed seed = ctx.bodyAsClass(Seed.class);
        plantService.plantFlowers(
                new Flower(
                        seed.flowerType(),
                        seed.color(),
                        GrowthLevel.SEED,
                        WaterLevel.DRY,
                        SunshineLevel.NONE,
                        null,
                        FertilizerType.ORGANIC
                )
        );
        System.out.println(plantService.getGarden());
    }

    public void getGarden(Context ctx) throws InterruptedException {
        Thread.sleep(1000);
        ctx.json(plantService.getGarden());
        //send the flower from the server to the client in jsonString
    }

}
