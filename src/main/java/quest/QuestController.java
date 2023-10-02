package quest;

import java.util.List;
import io.javalin.http.Context;

public class QuestController {
    private QuestService questService;

    public QuestController(QuestService questService) {
        this.questService = questService;
    }

    public void getAvailableQuests(Context ctx) throws InterruptedException {
        List<Quest> quests = questService.getAvailableQuests();
        Thread.sleep(1000);
        ctx.json(quests);
    }
    public void getActiveQuests(Context ctx) throws InterruptedException{
        List<Quest> quests = questService.getActiveQuests();
        Thread.sleep(1000);
        ctx.json(quests);
    }
}
