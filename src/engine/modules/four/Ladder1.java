package engine.modules.four;

import engine.objects.Task;
import engine.data.GameObjectIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class Ladder1 extends Task<ClientContext> {
    public Ladder1(ClientContext ctx) {
        super(ctx);
    }

    private GameObjectIds goids = new GameObjectIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 250;
    }

    @Override
    public void execute() {
        if (goids.nearestLadder1.inViewport()) {
            ctx.camera.turnTo(goids.nearestLadder1);
            goids.nearestLadder1.interact("Climb-down");
        } else {
            ctx.camera.turnTo(goids.nearestLadder1);
            ctx.movement.step(goids.nearestLadder1);
        }
    }
}
