package plant;

import io.javalin.http.Context;
import java.util.List;

public class PlantController {
    private final PlantService plantService;

    public PlantController(PlantService plantService) {
        this.plantService = plantService;
    }

    public void plantFlowers(Context ctx) {
        Flower flower = ctx.bodyAsClass(Flower.class);
        plantService.plantFlowers(flower);
    }

    public void getGarden(Context ctx) {
        ctx.json(plantService.getGarden());
        //send the flower from the server to the client in jsonString
    }
}
