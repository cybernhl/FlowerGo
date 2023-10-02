package app.flowergo;

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
        var questController = new QuestController(new QuestService());
        var plantController = new PlantController(new PlantService());
        var app = Javalin.create(javalinConfig -> {
            javalinConfig.staticFiles.add("src/main/resources/public", Location.EXTERNAL);
            javalinConfig.staticFiles.enableWebjars();
        }).routes(() -> {
            get("/", ctx -> ctx.result("Flower Go"));
            get("/quests", new VueComponent("quests-page"));
            get("/plant", new VueComponent("app.flowergo.plant-page"));
            get("/garden", new VueComponent("garden-page"));
            path("/api", () -> {
                get("/quests", questController::getAvailableQuests);
                post("/plant", plantController::plantFlowers);
                get("/flowers", plantController::getGarden);
            });
        }).start(7070);
    }
}
