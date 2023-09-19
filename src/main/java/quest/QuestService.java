package quest;
import java.util.ArrayList;
import java.util.List;

public class QuestService {
    List<Quest> quests = List.of(
            new Quest("water a yellow flower", "find a yellow flower and water it", "/imgs/water-yellow-flower.png")
    );
    List<Quest> getAll() {
        return quests;
    }
}
