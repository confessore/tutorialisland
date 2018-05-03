package engine.modules.two;

import engine.objects.Task;
import engine.data.NpcIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class Fish extends Task<ClientContext> {
    public Fish(ClientContext ctx) {
        super(ctx);
    }

    private NpcIds npcids = new NpcIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 80;
    }

    @Override
    public void execute() {
        if (npcids.nearestFishingSpot.inViewport()) {
            ctx.camera.turnTo(npcids.nearestFishingSpot);
            npcids.nearestFishingSpot.interact("Net");
        } else {
            ctx.camera.turnTo(npcids.nearestFishingSpot);
            ctx.movement.step(npcids.nearestFishingSpot);
        }
    }
}
