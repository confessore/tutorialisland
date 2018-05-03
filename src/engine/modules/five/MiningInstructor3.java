package engine.modules.five;

import engine.objects.Task;
import engine.data.NpcIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class MiningInstructor3 extends Task<ClientContext> {
    public MiningInstructor3(ClientContext ctx) {
        super(ctx);
    }

    private NpcIds npcids = new NpcIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 330;
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