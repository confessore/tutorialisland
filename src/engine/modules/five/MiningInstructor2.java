package engine.modules.five;

import engine.objects.Task;
import engine.data.NpcIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class MiningInstructor2 extends Task<ClientContext> {
    public MiningInstructor2(ClientContext ctx) {
        super(ctx);
    }

    private NpcIds npcids = new NpcIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 290 || VarpbitsArray.varpbitsArray[281] == 291;
    }

    @Override
    public void execute() {
        if (npcids.nearestMiningInstructor.inViewport()) {
            ctx.camera.turnTo(npcids.nearestMiningInstructor);
            npcids.nearestMiningInstructor.interact("Talk-to");
        } else {
            ctx.camera.turnTo(npcids.nearestMiningInstructor);
            ctx.movement.step(npcids.nearestMiningInstructor);
        }
    }
}
