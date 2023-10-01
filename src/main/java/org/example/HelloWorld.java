package org.example;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;
import io.javalin.vue.VueComponent;
import plant.PlantController;
import plant.PlantService;
import quest.QuestController;
import quest.QuestService;

import static io.javalin.apibuilder.ApiBuilder.*;

public class HelloWorld {
    public static void main(String[] args) {
        var questController = new QuestController(new QuestService());
        var plantController = new PlantController(new PlantService());
        var app = Javalin.create(javalinConfig -> {
            javalinConfig.staticFiles.add("src/main/resources/public", Location.EXTERNAL);
            javalinConfig.staticFiles.enableWebjars();
        }).routes(() -> {
            get("/", ctx -> ctx.result("Flower Go"));
            get("/quests", new VueComponent("quests-page"));
            get("/plant", new VueComponent("plant-page"));
            get("/garden", new VueComponent("garden-page"));
            path("/api", () -> {
                get("/quests", questController::getAvailableQuests);
                post("/plant", plantController::plantFlowers);
                get("/flowers", plantController::getGarden);
            });
        }).start(7070);
    }
}