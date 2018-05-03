package engine.modules.five;

import engine.objects.Task;
import engine.data.GameObjectIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class Prospect extends Task<ClientContext> {
    public Prospect(ClientContext ctx) {
        super(ctx);
    }

    private GameObjectIds goids = new GameObjectIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 270 || VarpbitsArray.varpbitsArray[281] == 280
                || VarpbitsArray.varpbitsArray[281] == 281;
    }

    @Override
    public void execute() {
        if (VarpbitsArray.varpbitsArray[281] == 270 || VarpbitsArray.varpbitsArray[281] == 281) {
            if (goids.nearestTinVein.inViewport()) {
                ctx.camera.turnTo(goids.nearestTinVein);
                goids.nearestTinVein.interact("Prospect");
            } else {
                ctx.camera.turnTo(goids.nearestTinVein);
                ctx.movement.step(goids.nearestTinVein);
            }
        } else {
            if (goids.nearestCopperVein.inViewport()) {
                ctx.camera.turnTo(goids.nearestCopperVein);
                goids.nearestCopperVein.interact("Prospect");
            } else {
                ctx.camera.turnTo(goids.nearestCopperVein);
                ctx.movement.step(goids.nearestCopperVein);
            }
        }
    }
}
