package engine.modules.four;

import engine.objects.Task;
import engine.data.NpcIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class QuestGuide2 extends Task<ClientContext> {
    public QuestGuide2(ClientContext ctx) {
        super(ctx);
    }

    private NpcIds npcids = new NpcIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 240;
    }

    @Override
    public void execute() {
        if (npcids.nearestQuestGuide.inViewport()) {
            ctx.camera.turnTo(npcids.nearestQuestGuide);
            npcids.nearestQuestGuide.interact("Talk-to");
        } else {
            ctx.camera.turnTo(npcids.nearestQuestGuide);
            ctx.movement.step(npcids.nearestQuestGuide);
        }
    }
}
