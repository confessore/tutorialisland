package engine.modules.six;

import engine.data.NpcIds;
import engine.objects.Task;
import engine.data.ComponentIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class CombatInstructor2 extends Task<ClientContext> {
    public CombatInstructor2(ClientContext ctx) {
        super(ctx);
    }

    private ComponentIds cids = new ComponentIds(ctx);
    private NpcIds npcids = new NpcIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 410;
    }

    @Override
    public void execute() {
        if (cids.equipmentStatsWindow.visible())
            cids.equipmentStatsWindowCloseButton.click();
        else {
            if (npcids.nearestCombatInstructor.inViewport()) {
                ctx.camera.turnTo(npcids.nearestCombatInstructor);
                npcids.nearestCombatInstructor.interact("Talk-to");
            } else {
                ctx.camera.turnTo(npcids.nearestCombatInstructor);
                ctx.movement.step(npcids.nearestCombatInstructor);
            }
        }
    }
}
