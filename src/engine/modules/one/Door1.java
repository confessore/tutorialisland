package engine.modules.one;

import engine.objects.Task;
import engine.data.GameObjectIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class Door1 extends Task<ClientContext> {
    public Door1(ClientContext ctx) {
        super(ctx);
    }

    private GameObjectIds goids = new GameObjectIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 10;
    }

    @Override
    public void execute() {
        if (goids.nearestDoor1.inViewport()) {
            ctx.camera.turnTo(goids.nearestDoor1);
            goids.nearestDoor1.interact("Open");
        } else {
            ctx.camera.turnTo(goids.nearestDoor1);
            ctx.movement.step(goids.nearestDoor1);
        }
    }
}
