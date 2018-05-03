package engine.modules.ten;

import engine.data.ComponentIds;
import engine.objects.Task;
import engine.data.NpcIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class MagicInstructor2 extends Task<ClientContext> {
    public MagicInstructor2(ClientContext ctx) {
        super(ctx);
    }

    private ComponentIds cids = new ComponentIds(ctx);
    private NpcIds npcids = new NpcIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 670;
    }

    @Override
    public void execute() {
        if (cids.clickContinue.visible())
            cids.clickContinue.click();
        else {
            if (npcids.nearestMagicInstructor.inViewport()) {
                ctx.camera.turnTo(npcids.nearestMagicInstructor);
                npcids.nearestMagicInstructor.interact("Talk-to");
            } else {
                ctx.camera.turnTo(npcids.nearestMagicInstructor);
                ctx.movement.step(npcids.nearestMagicInstructor);
            }
        }
    }
}
