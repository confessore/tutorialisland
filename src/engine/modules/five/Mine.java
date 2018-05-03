package engine.modules.five;

import engine.objects.Task;
import engine.data.GameObjectIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class Mine extends Task<ClientContext> {
    public Mine(ClientContext ctx) {
        super(ctx);
    }

    private GameObjectIds goids = new GameObjectIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 300 || VarpbitsArray.varpbitsArray[281] == 310
                || VarpbitsArray.varpbitsArray[281] == 311;
    }

    @Override
    public void execute() {
        if (VarpbitsArray.varpbitsArray[281] == 300 || VarpbitsArray.varpbitsArray[281] == 311) {
            if (goids.nearestTinVein.inViewport()) {
                ctx.camera.turnTo(goids.nearestTinVein);
                goids.nearestTinVein.interact("Mine");
            } else {
                ctx.camera.turnTo(goids.nearestTinVein);
                ctx.movement.step(goids.nearestTinVein);
            }
        } else {
            if (goids.nearestCopperVein.inViewport()) {
                ctx.camera.turnTo(goids.nearestCopperVein);
                goids.nearestCopperVein.interact("Mine");
            } else {
                ctx.camera.turnTo(goids.nearestCopperVein);
                ctx.movement.step(goids.nearestCopperVein);
            }
        }
    }
}
