package quest;

import java.util.List;
import io.javalin.http.Context;

public class QuestController {
    private QuestService questService;

    public QuestController(QuestService questService) {
        this.questService = questService;
    }

    public void getAllQuests(Context ctx) {
        List<Quest> quests = questService.getAll();
        ctx.json(quests);
    }
}
