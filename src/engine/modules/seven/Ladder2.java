package engine.modules.seven;

import engine.objects.Task;
import engine.data.GameObjectIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class Ladder2 extends Task<ClientContext> {
    public Ladder2(ClientContext ctx) {
        super(ctx);
    }

    private GameObjectIds goids = new GameObjectIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 500;
    }

    @Override
    public void execute() {
        if (goids.nearestLadder2.inViewport()) {
            ctx.camera.turnTo(goids.nearestLadder2);
            goids.nearestLadder2.interact("Climb-up");
        } else {
            ctx.camera.turnTo(goids.nearestLadder2);
            ctx.movement.step(goids.nearestLadder2);
        }
    }
}
