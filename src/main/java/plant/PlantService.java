package plant;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class PlantService {
    private final List<Flower> garden = new ArrayList<>(List.of(
            new Flower(
                    FlowerType.SUNFLOWER,
                    Color.YELLOW,
                    GrowthLevel.BUD,
                    WaterLevel.SLIGHTLY_MOIST,
                    SunshineLevel.NONE,
                    Instant.now(),
                    FertilizerType.ORGANIC
            ))
    );

    public void plantFlowers(Flower flower) {
        garden.add(flower);
    }

    public List<Flower> getGarden() {
        return garden;
    }
}
