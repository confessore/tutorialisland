package engine.modules.seven;

import engine.objects.Task;
import engine.data.NpcIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class RatMelee extends Task<ClientContext> {
    public RatMelee(ClientContext ctx) {
        super(ctx);
    }

    private NpcIds npcids = new NpcIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 450 || VarpbitsArray.varpbitsArray[281] == 460;
    }

    @Override
    public void execute() {
        if (npcids.nearestGiantRat.inViewport()) {
            ctx.camera.turnTo(npcids.nearestGiantRat);
            npcids.nearestGiantRat.interact("Attack");
        } else {
            ctx.camera.turnTo(npcids.nearestGiantRat);
            ctx.movement.step(npcids.nearestGiantRat);
        }
    }
}
