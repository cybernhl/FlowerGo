package app.flowergo.user;

import app.flowergo.inventory.Inventory;
import app.flowergo.location.Location;
import app.flowergo.plant.Seed;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserService {
    private final Map<String, User> users; // Store app.flowergo.user data by username

    public UserService() {
        this.users = new HashMap<>();
    }

    // Create a new app.flowergo.user and add them to the app.flowergo.user database
    public void createUser(String username) {
        if (!users.containsKey(username)) {
            User newUser = new User(username, new Inventory(new ArrayList<>(), new ArrayList<>() ));
            users.put(username, newUser);
        }
    }

    // Retrieve app.flowergo.user information by username
    public User getUser(String username) {
        return users.get(username);
    }

    // Add seeds to a app.flowergo.user's app.flowergo.inventory
    public void addSeedsToUser(String username, List<Seed> seedsToAdd) {
        User user = users.get(username);
        if (user != null) {
            var updatedUser = user.addSeeds(seedsToAdd);
            users.put(username, updatedUser);
        }
    }

    public void removeSeeds(String username, List<Seed> seedsToRemove){
        User user = users.get(username);
        if (user != null){
            var updatedUser = user.removeSeeds(seedsToRemove);
            users.put(username, updatedUser);
        }
    }

    public void plantSeed(String userName, Seed seed, Location location){
        User user = users.get(userName);
        if (user !=null){
            var updatedUser = user.plantSeeds(seed);
            users.put(userName, updatedUser);
        }
    }
}
