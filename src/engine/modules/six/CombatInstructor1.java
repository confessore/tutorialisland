package engine.modules.six;

import engine.objects.Task;
import engine.data.NpcIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class CombatInstructor1 extends Task<ClientContext> {
    public CombatInstructor1(ClientContext ctx) {
        super(ctx);
    }

    private NpcIds npcids = new NpcIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 370;
    }

    @Override
    public void execute() {
        if (npcids.nearestCombatInstructor.inViewport()) {
            ctx.camera.turnTo(npcids.nearestCombatInstructor);
            npcids.nearestCombatInstructor.interact("Talk-to");
        } else {
            ctx.camera.turnTo(npcids.nearestCombatInstructor);
            ctx.movement.step(npcids.nearestCombatInstructor);
        }
    }
}
