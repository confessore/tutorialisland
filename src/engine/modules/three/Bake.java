package engine.modules.three;

import engine.data.ComponentIds;
import engine.data.GameObjectIds;
import engine.objects.Task;
import engine.data.ItemIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class Bake extends Task<ClientContext> {
    public Bake(ClientContext ctx) {
        super(ctx);
    }

    private ComponentIds cids = new ComponentIds(ctx);
    private GameObjectIds goids = new GameObjectIds(ctx);
    private ItemIds iids = new ItemIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 160;
    }

    @Override
    public void execute() {
        if (cids.backpackWindow.visible()) {
            if (goids.nearestRange.inViewport()) {
                ctx.camera.turnTo(goids.nearestRange);
                iids.UseItem(iids.breadDough);
                goids.nearestRange.interact("Use");
            } else {
                ctx.camera.turnTo(goids.nearestRange);
                ctx.movement.step(goids.nearestRange);
            }
        } else
            cids.backpackButton.click();
    }
}
