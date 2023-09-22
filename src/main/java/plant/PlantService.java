package plant;

import java.util.ArrayList;
import java.util.List;

public class PlantService {
    private List<Flower> garden;
    public PlantService(){
        garden = new ArrayList<>();
    }
    public void plantFlowers(Flower flower){
        garden.add(flower);
    }
    public List<Flower> getGarden(){
        return garden;
    }
}
