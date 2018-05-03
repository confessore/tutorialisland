package engine.modules.nine;

import engine.objects.Task;
import engine.data.NpcIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class BrotherBrace3 extends Task<ClientContext> {
    public BrotherBrace3(ClientContext ctx) {
        super(ctx);
    }

    private NpcIds npcids = new NpcIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 600;
    }

    @Override
    public void execute() {
        if (npcids.nearestBrotherBrace.inViewport()) {
            ctx.camera.turnTo(npcids.nearestBrotherBrace);
            npcids.nearestBrotherBrace.interact("Talk-to");
        } else {
            ctx.camera.turnTo(npcids.nearestBrotherBrace);
            ctx.movement.step(npcids.nearestBrotherBrace);
        }
    }
}
