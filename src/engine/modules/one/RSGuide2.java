package engine.modules.one;

import engine.objects.Task;
import engine.data.NpcIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class RSGuide2 extends Task<ClientContext> {
    public RSGuide2(ClientContext ctx) {
        super(ctx);
    }

    private NpcIds npcids = new NpcIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 7;
    }

    @Override
    public void execute() {
        if (npcids.nearestRuneScapeGuide.inViewport()) {
            ctx.camera.turnTo(npcids.nearestRuneScapeGuide);

            npcids.nearestRuneScapeGuide.interact("Talk-to");
        } else {
            ctx.camera.turnTo(npcids.nearestRuneScapeGuide);
            ctx.movement.step(npcids.nearestRuneScapeGuide); }
    }
}
