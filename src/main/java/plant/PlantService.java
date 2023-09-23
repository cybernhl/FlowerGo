package plant;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class PlantService {
    private final List<Flower> garden = List.of(
            new Flower(
                    "Steve",
                    "SunFlower",
                    Color.YELLOW,
                    GrowthLevel.BUD,
                    WaterLevel.SLIGHTLY_MOIST,
                    SunshineLevel.NONE,
                    Instant.now()
            )
    );

    public void plantFlowers(Flower flower) {
        garden.add(flower);
    }

    public List<Flower> getGarden() {
        return garden;
    }
}
