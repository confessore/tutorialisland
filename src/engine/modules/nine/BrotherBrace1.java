package engine.modules.nine;

import engine.objects.Task;
import engine.data.GameObjectIds;
import engine.data.NpcIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class BrotherBrace1 extends Task<ClientContext> {
    public BrotherBrace1(ClientContext ctx) {
        super(ctx);
    }

    private NpcIds npcids = new NpcIds(ctx);
    private GameObjectIds goids = new GameObjectIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 550;
    }

    @Override
    public void execute() {
        if (goids.nearestLargeDoorClosed.valid()) {
            if (goids.nearestLargeDoorClosed.inViewport()) {
                ctx.camera.turnTo(goids.nearestLargeDoorClosed);
                goids.nearestLargeDoorClosed.interact("Open");
            } else {
                ctx.camera.turnTo(goids.nearestLargeDoorClosed);
                ctx.movement.step(goids.nearestLargeDoorClosed);
            }
        }
        else {
            if (npcids.nearestBrotherBrace.inViewport() || goids.nearestLargeDoorOpen.inViewport()) {
                ctx.camera.turnTo(npcids.nearestBrotherBrace);
                ctx.movement.step(npcids.nearestBrotherBrace);
                npcids.nearestBrotherBrace.interact("Talk-to");
            } else {
                ctx.camera.turnTo(npcids.nearestBrotherBrace);
                ctx.movement.step(goids.nearestLargeDoorOpen);
            }
        }
    }
}
