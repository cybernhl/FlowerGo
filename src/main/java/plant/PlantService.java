package plant;

import java.util.ArrayList;
import java.util.List;

public class PlantService {
    private List<Flower> garden;
    public PlantService(){
        garden = new ArrayList<>();
    }
    public void plantFlowers(String name, String type,  int growthLevel, int waterLevel, int sunshineLevel){
        Flower flower = new Flower(name, type, growthLevel, waterLevel, sunshineLevel);
        garden.add(flower);
    }
    public List<Flower> getGarden(){
        return garden;
    }
}
