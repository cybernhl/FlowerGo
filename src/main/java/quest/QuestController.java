package quest;

import java.util.List;
import io.javalin.http.Context;

public class QuestController {
    private QuestService questService;

    public QuestController(QuestService questService) {
        this.questService = questService;
    }

    public void getAvailableQuests(Context ctx) throws InterruptedException {
        List<Quest> AvailableQuests = questService.getAvailableQuests();
        Thread.sleep(1000);
        ctx.json(AvailableQuests);
    }
    public void getActiveQuests(Context ctx) throws InterruptedException{
        List<Quest> ActiveQuests = questService.getActiveQuests();
        Thread.sleep(1000);
        ctx.json(ActiveQuests);
    }
    public void getCompletedQuests(Context ctx) throws InterruptedException{
        List<Quest> completedQuests = questService.getCompleteQuests();
        Thread.sleep(1000);
        ctx.json(completedQuests);
    }
}
