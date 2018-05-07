package engine.modules.four.tasks;

import engine.constants.NPCs;
import engine.constants.Varps;
import engine.objects.Task;

import org.powerbot.script.rt4.ClientContext;

public class QuestGuide extends Task<ClientContext> {
    public QuestGuide(ClientContext ctx) {
        super(ctx);
    }

    private NPCs npcs = new NPCs(ctx);
    private Varps varps = new Varps(ctx);

    @Override
    public boolean activate() {
        return varps.get(281) == 220 || varps.get(281) == 240;
    }

    @Override
    public void execute() {
        npcs.talk(npcs.QUEST_GUIDE);
    }
}
