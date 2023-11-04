package app.flowergo.plant;

import java.util.ArrayList;
import java.util.List;

public class PlantService {
    private final List<Flower> garden = new ArrayList<>(List.of());

    public void plantFlowers(Flower flower) {
        garden.add(flower);
    }

    public List<Flower> getGarden() {
        return garden;
    }
}
