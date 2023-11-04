package app.flowergo;

import app.flowergo.inventory.InventoryController;
import app.flowergo.inventory.InventoryService;
import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;
import io.javalin.vue.VueComponent;
import app.flowergo.plant.PlantController;
import app.flowergo.plant.PlantService;
import app.flowergo.quest.QuestController;
import app.flowergo.quest.QuestService;

import static io.javalin.apibuilder.ApiBuilder.*;

public class FlowerGoMain {
    public static void main(String[] args) {
        var inventoryService = new InventoryService();
        var questController = new QuestController(new QuestService());
        var plantController = new PlantController(new PlantService(), inventoryService);
        var inventoryController = new InventoryController(inventoryService);
        var app = Javalin.create(javalinConfig -> {
            javalinConfig.staticFiles.add("src/main/resources/public", Location.EXTERNAL);
            javalinConfig.staticFiles.enableWebjars();
            javalinConfig.router.apiBuilder(() -> {
                get("/", ctx -> ctx.result("Flower Go"));
                get("/quests", new VueComponent("quests-page"));
                get("/plant", new VueComponent("plant-page"));
                get("/garden", new VueComponent("garden-page"));
                path("/api", () -> {
                    get("/quests", questController::getAvailableQuests);
                    post("/plant", plantController::plantFlowers);
                    get("/garden", plantController::getGarden);
                    get("/inventory", inventoryController::getInventory);
                });
            });
        }).start(7070);
    }
}
