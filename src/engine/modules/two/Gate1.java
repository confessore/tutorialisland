package engine.modules.two;

import engine.objects.Task;
import engine.data.GameObjectIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class Gate1 extends Task<ClientContext> {
    public Gate1(ClientContext ctx) {
        super(ctx);
    }

    private GameObjectIds goids = new GameObjectIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 120;
    }

    @Override
    public void execute() {
        if (goids.nearestGate1.inViewport()) {
            ctx.camera.turnTo(goids.nearestGate1);
            goids.nearestGate1.interact("Open");
        } else {
            ctx.camera.turnTo(goids.nearestGate1);
            ctx.movement.step(goids.nearestGate1);
        }
    }
}
