package engine.modules.two;

import engine.objects.Task;
import engine.data.NpcIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class SurvivalExpert1 extends Task<ClientContext> {
    public SurvivalExpert1(ClientContext ctx) {
        super(ctx);
    }

    private NpcIds npcids = new NpcIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 20;
    }

    @Override
    public void execute() {
        if (npcids.nearestSurvivalExpert.inViewport()) {
            ctx.camera.turnTo(npcids.nearestSurvivalExpert);
            npcids.nearestSurvivalExpert.interact("Talk-to");
        } else {
            ctx.camera.turnTo(npcids.nearestSurvivalExpert);
            ctx.movement.step(npcids.nearestSurvivalExpert);
        }
    }
}
