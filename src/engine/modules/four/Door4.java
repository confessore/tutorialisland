package engine.modules.four;

import engine.objects.Task;
import engine.data.GameObjectIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class Door4 extends Task<ClientContext> {
    public Door4(ClientContext ctx) {
        super(ctx);
    }

    private GameObjectIds goids = new GameObjectIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 210;
    }

    @Override
    public void execute() {
        if (goids.nearestDoor4.inViewport()) {
            ctx.camera.turnTo(goids.nearestDoor4);
            goids.nearestDoor4.interact("Open");
        } else {
            ctx.camera.turnTo(goids.nearestDoor4);
            ctx.movement.step(goids.nearestDoor4);
        }
    }
}
