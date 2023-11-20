package app.flowergo.plant;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class PlantService {

    private final List<Flower> garden = new ArrayList<>(List.of(
            new Flower(
                    FlowerType.ROSE,
                    Color.RED,
                    GrowthLevel.FULL_BLOOM,
                    WaterLevel.DAMP,
                    SunshineLevel.MODERATE,
                    Instant.now(),
                    FertilizerType.ORGANIC
            )
    ));

    public void plantFlowers(Flower flower) {
        garden.add(flower);
    }

    public List<Flower> getGarden() {
        return garden;
    }
}
