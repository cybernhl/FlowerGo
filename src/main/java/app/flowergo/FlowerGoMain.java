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

import java.util.Map;

import static io.javalin.apibuilder.ApiBuilder.*;

public class FlowerGoMain {

    static boolean hasFinishedTutorial = true; // so we don`t have to read it all the time

    public static void main(String[] args) {
        var inventoryService = new InventoryService();
        var questController = new QuestController(new QuestService());
        var plantController = new PlantController(new PlantService(), inventoryService);
        var inventoryController = new InventoryController(inventoryService);
        var app = Javalin.create(javalinConfig -> {
            javalinConfig.bundledPlugins.enableDevLogging(config -> {
                config.skipStaticFiles = true;
            });
            javalinConfig.vue.stateFunction = ctx -> Map.of(
                    //"username", ctx.sessionAttribute("username"),
                    "needsTutorial", !hasFinishedTutorial
            );
            javalinConfig.staticFiles.add("src/main/resources/public", Location.EXTERNAL);
            javalinConfig.staticFiles.enableWebjars();
            javalinConfig.router.apiBuilder(() -> {
                get("/", ctx -> ctx.redirect("/garden"));
                get("/quests", new VueComponent("quests-page"));
                get("/plant", new VueComponent("plant-page"));
                get("/garden", new VueComponent("garden-page"));
                path("/api", () -> {
                    get("/quests", questController::getAvailableQuests);
                    post("/plant", plantController::plantFlowers);
                    get("/garden", plantController::getGarden);
                    get("/inventory", inventoryController::getInventory);
                    patch("/tutorial-read", ctx -> hasFinishedTutorial = true);
                });
            });
        }).start(7070);//FIXME PORT　7070 can not use !! bind !!
    }
}
