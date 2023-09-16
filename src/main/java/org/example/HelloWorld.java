package org.example;

import io.javalin.Javalin;
import io.javalin.vue.VueComponent;

public class HelloWorld {
    public static void main(String[] args) {
        var app = Javalin.create(javalinConfig -> {
                    javalinConfig.staticFiles.add("/public");
                    javalinConfig.staticFiles.enableWebjars();
                })
                .get("/", ctx -> ctx.result("Hello World"))
                .get("/quests", new VueComponent("quests-page"))
                .get("/plant", new VueComponent("plant-page"))
                .get("/garden", new VueComponent("garden-page"))
                .start(7070);
    }
}