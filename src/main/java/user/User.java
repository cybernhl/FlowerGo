package user;

import inventory.Inventory;
import plant.Seed;

import java.util.ArrayList;
import java.util.List;

public record User(String username, Inventory inventory) {

    public User addSeeds(List<Seed> seedsToAdd) {
        List<Seed> currentSeeds = new ArrayList<>(inventory.seedList());// Create a copy of the current seeds
        currentSeeds.addAll(seedsToAdd); // Add new seeds to the copy
        return new User(username, new Inventory(currentSeeds, inventory.fertilizerList())); // Return a new User record with updated seeds
    }

    public User removeSeeds(List<Seed> seedsToRemove){
        List<Seed> currentSeeds = new ArrayList<>(inventory.seedList());
        currentSeeds.removeAll(seedsToRemove);
        return new User(username, new Inventory(currentSeeds, inventory.fertilizerList()));
    }
    // Constructors, getters, and other methods can be added as needed
    // int level, int experience <<skip these two for now
}
