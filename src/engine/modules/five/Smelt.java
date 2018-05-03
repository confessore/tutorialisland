package engine.modules.five;

import engine.data.ComponentIds;
import engine.data.GameObjectIds;
import engine.objects.Task;
import engine.data.ItemIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class Smelt extends Task<ClientContext> {
    public Smelt(ClientContext ctx) {
        super(ctx);
    }

    private ComponentIds cids = new ComponentIds(ctx);
    private GameObjectIds goids = new GameObjectIds(ctx);
    private ItemIds iids = new ItemIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 320;
    }

    @Override
    public void execute() {
        if (cids.backpackWindow.visible()) {
            if (goids.nearestFurnace.inViewport()) {
                ctx.camera.turnTo(goids.nearestFurnace);
                iids.UseItem(iids.tinOre);
                goids.nearestFurnace.interact("Use");
            } else {
                ctx.camera.turnTo(goids.nearestFurnace);
                ctx.movement.step(goids.nearestFurnace);
            }
        } else {
            cids.backpackButton.click();
        }
    }
}
