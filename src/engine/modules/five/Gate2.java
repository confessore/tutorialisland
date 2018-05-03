package engine.modules.five;

import engine.objects.Task;
import engine.data.GameObjectIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class Gate2 extends Task<ClientContext> {
    public Gate2(ClientContext ctx) {
        super(ctx);
    }

    private GameObjectIds goids = new GameObjectIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 360;
    }

    @Override
    public void execute() {
        if (goids.nearestGate2.inViewport()) {
            ctx.camera.turnTo(goids.nearestGate2);
            goids.nearestGate2.interact("Open");
        } else {
            ctx.camera.turnTo(goids.nearestGate2);
            ctx.movement.step(goids.nearestGate2);
        }
    }
}
