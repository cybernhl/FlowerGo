package app.flowergo.user;

import io.javalin.http.Context;

public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void getUser(Context ctx) {
        ctx.json(userService.getUser(ctx.pathParam("userID")));
    }
}
