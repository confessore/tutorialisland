package engine.modules.three;

import engine.objects.Task;
import engine.data.GameObjectIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class Door2 extends Task<ClientContext> {
    public Door2(ClientContext ctx) {
        super(ctx);
    }

    private GameObjectIds goids = new GameObjectIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 130;
    }

    @Override
    public void execute() {
        if (goids.nearestDoor2.inViewport()) {
            ctx.camera.turnTo(goids.nearestDoor2);
            goids.nearestDoor2.interact("Open");
        } else {
            ctx.camera.turnTo(goids.nearestDoor2);
            ctx.movement.step(goids.nearestDoor2);
        }
    }
}
