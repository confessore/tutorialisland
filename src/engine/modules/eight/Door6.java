package engine.modules.eight;

import engine.objects.Task;
import engine.data.GameObjectIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class Door6 extends Task<ClientContext> {
    public Door6(ClientContext ctx) {
        super(ctx);
    }

    private GameObjectIds goids = new GameObjectIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 540;
    }

    @Override
    public void execute() {
        if (goids.nearestDoor6.inViewport()) {
            ctx.camera.turnTo(goids.nearestDoor6);
            goids.nearestDoor6.interact("Open");
        } else {
            ctx.camera.turnTo(goids.nearestDoor6);
            ctx.movement.step(goids.nearestDoor6);
        }
    }
}
