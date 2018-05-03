package engine.modules.three;

import engine.objects.Task;
import engine.data.GameObjectIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class Door3 extends Task<ClientContext> {
    public Door3(ClientContext ctx) {
        super(ctx);
    }

    private GameObjectIds goids = new GameObjectIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 180;
    }

    @Override
    public void execute() {
        if (goids.nearestDoor3.inViewport()) {
            ctx.camera.turnTo(goids.nearestDoor3);
            goids.nearestDoor3.interact("Open");
        } else {
            ctx.camera.turnTo(goids.nearestDoor3);
            ctx.movement.step(goids.nearestDoor3);
        }
    }
}
