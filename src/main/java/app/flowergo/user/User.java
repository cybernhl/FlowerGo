package app.flowergo.user;

import app.flowergo.inventory.Inventory;
import app.flowergo.plant.Seed;

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

    public User plantSeeds(Seed seedsToPlant){
        List<Seed> currentSeeds = new ArrayList<>(inventory.seedList());
        currentSeeds.remove(0);
        return new User(username, new Inventory(currentSeeds, inventory.fertilizerList()));
    }
}
