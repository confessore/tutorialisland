package engine.modules.two;

import engine.data.ComponentIds;
import engine.data.GameObjectIds;
import engine.objects.Task;
import engine.data.ItemIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class Fire extends Task<ClientContext> {
    public Fire(ClientContext ctx) {
        super(ctx);
    }

    private ComponentIds cids = new ComponentIds(ctx);
    private GameObjectIds goids = new GameObjectIds(ctx);
    private ItemIds iids = new ItemIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 50;
    }

    @Override
    public void execute() {
        if (cids.backpackWindow.visible()) {
            if (ctx.inventory.select().id(iids.log).poll().valid()) {
                iids.UseItem(iids.tinderbox);
                iids.UseItem(iids.log);
            } else {
                if (goids.nearestTree.inViewport()) {
                    ctx.camera.turnTo(goids.nearestTree);
                    goids.nearestTree.interact("Chop down");
                } else {
                    ctx.camera.turnTo(goids.nearestTree);
                    ctx.movement.step(goids.nearestTree);
                }
            }
        } else
            cids.backpackButton.click();
    }
}