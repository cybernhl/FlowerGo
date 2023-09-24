package user;

import plant.Seed;

import java.util.ArrayList;
import java.util.List;

public record User(String username, List<Seed> seeds) {

    public User addSeeds(List<Seed> seedsToAdd) {
        List<Seed> currentSeeds = new ArrayList<>(seeds); // Create a copy of the current seeds
        currentSeeds.addAll(seedsToAdd); // Add new seeds to the copy
        return new User(username, currentSeeds); // Return a new User record with updated seeds
    }

    public User removeSeeds(List<Seed> oldSeeds){
        List<Seed> currentSeeds = new ArrayList<>(oldSeeds);
        currentSeeds.removeAll(currentSeeds);
        return new User(username, currentSeeds);
    }
    // Constructors, getters, and other methods can be added as needed
    // int level, int experience <<skip these two for now
}
