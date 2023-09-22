package plant;

import java.util.List;

public class PlantController {
    private final PlantService plantService;

    public PlantController(PlantService plantService) {
        this.plantService = plantService;
    }
    public void plantFlowers(String name, String type, int growth, int waterLevel, int sunshineLevel, int fertilizerLevel){
        plantService.plantFlowers(name, type, growth, waterLevel, sunshineLevel, fertilizerLevel);
    }
    public List<Flower> getGarden(){
        return plantService.getGarden();
    }
}
