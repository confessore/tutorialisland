package engine.modules.eight;

import engine.objects.Task;
import engine.data.GameObjectIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class Door5 extends Task<ClientContext> {
    public Door5(ClientContext ctx) {
        super(ctx);
    }

    private GameObjectIds goids = new GameObjectIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 525;
    }

    @Override
    public void execute() {
        if (goids.nearestDoor5.inViewport()) {
            ctx.camera.turnTo(goids.nearestDoor5);
            goids.nearestDoor5.interact("Open");
        } else {
            ctx.camera.turnTo(goids.nearestDoor5);
            ctx.movement.step(goids.nearestDoor5);
        }
    }
}
