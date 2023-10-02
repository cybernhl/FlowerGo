package app.flowergo.plant;

import io.javalin.http.Context;

public class PlantController {
    private final PlantService plantService;

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
                ));
    }

    public void getGarden(Context ctx) {
        ctx.json(plantService.getGarden());
        //send the flower from the server to the client in jsonString
    }
}
