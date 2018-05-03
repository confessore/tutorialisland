package engine.modules.eight;

import engine.objects.Task;
import engine.data.GameObjectIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class Bank extends Task<ClientContext> {
    public Bank(ClientContext ctx) {
        super(ctx);
    }

    private GameObjectIds goids = new GameObjectIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 510;
    }

    @Override
    public void execute() {
        if (goids.nearestBank.inViewport()) {
            ctx.camera.turnTo(goids.nearestBank);
            goids.nearestBank.interact("Use");
        } else {
            ctx.camera.turnTo(goids.nearestBank);
            ctx.movement.step(goids.nearestBank);
        }
    }
}
