package engine.modules.ten;

import engine.objects.Task;
import engine.data.NpcIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.Tile;
import org.powerbot.script.rt4.ClientContext;

public class MagicInstructor1 extends Task<ClientContext> {
    public MagicInstructor1(ClientContext ctx) {
        super(ctx);
    }

    private NpcIds npcids = new NpcIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 620;
    }

    @Override
    public void execute() {
        if (npcids.nearestMagicInstructor.inViewport()) {
            ctx.camera.turnTo(npcids.nearestMagicInstructor);
            ctx.movement.step(npcids.nearestMagicInstructor);
            npcids.nearestMagicInstructor.interact("Talk-to");
        } else {
            ctx.camera.turnTo(npcids.nearestMagicInstructor);
            ctx.movement.step(npcids.nearestMagicInstructor);
            ctx.movement.step(new Tile(3139, 3087, 0));
        }
    }
}
