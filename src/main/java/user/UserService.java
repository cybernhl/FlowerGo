package user;

import inventory.Inventory;
import plant.Fertilizer;
import plant.Seed;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserService {
    private final Map<String, User> users; // Store user data by username

    public UserService() {
        this.users = new HashMap<>();
    }

    // Create a new user and add them to the user database
    public void createUser(String username) {
        if (!users.containsKey(username)) {
            User newUser = new User(username, new Inventory(new ArrayList<>(), new ArrayList<>() ));
            users.put(username, newUser);
        }
    }

    // Retrieve user information by username
    public User getUser(String username) {
        return users.get(username);
    }

    // Add seeds to a user's inventory
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
}
