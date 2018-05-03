package engine.modules.eight;

import engine.data.ComponentIds;
import engine.objects.Task;
import engine.data.GameObjectIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class Poll extends Task<ClientContext> {
    public Poll(ClientContext ctx) {
        super(ctx);
    }

    private ComponentIds cids = new ComponentIds(ctx);
    private GameObjectIds goids = new GameObjectIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 520;
    }

    @Override
    public void execute() {
        if (VarpbitsArray.varpbitsArray[375] == 8)
            cids.clickContinue.click();
        else {
            if (goids.nearestPoll.inViewport()) {
                ctx.camera.turnTo(goids.nearestPoll);
                goids.nearestPoll.interact("Use");
            } else {
                ctx.camera.turnTo(goids.nearestPoll);
                ctx.movement.step(goids.nearestPoll);
            }
        }
    }
}
