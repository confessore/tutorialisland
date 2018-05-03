package engine.modules.nine;

import engine.objects.Task;
import engine.data.GameObjectIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class Door7 extends Task<ClientContext> {
    public Door7(ClientContext ctx) {
        super(ctx);
    }

    private GameObjectIds goids = new GameObjectIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 610;
    }

    @Override
    public void execute() {
        if (goids.nearestDoor7.inViewport()) {
            ctx.camera.turnTo(goids.nearestDoor7);
            goids.nearestDoor7.interact("Open");
        } else {
            ctx.camera.turnTo(goids.nearestDoor7);
            ctx.movement.step(goids.nearestDoor7);
        }
    }
}
