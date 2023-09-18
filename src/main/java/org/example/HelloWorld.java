package org.example;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;
import io.javalin.vue.VueComponent;

import static io.javalin.apibuilder.ApiBuilder.get;
import static io.javalin.apibuilder.ApiBuilder.path;

public class HelloWorld {
    public static void main(String[] args) {
        var app = Javalin.create(javalinConfig -> {
            javalinConfig.staticFiles.add("src/main/resources/public", Location.EXTERNAL);
            javalinConfig.staticFiles.enableWebjars();
        }).routes(() -> {
            get("/", ctx -> ctx.result("Flower Go"));
            get("/quests", new VueComponent("quests-page"));
            get("/plant", new VueComponent("plant-page"));
            get("/garden", new VueComponent("garden-page"));
            path("/api", () -> {
                get("/quests", ctx -> ctx.result("quests"));
            });
        }).start(7070);
    }
}