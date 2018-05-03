package engine.modules.five;

import engine.data.ComponentIds;
import engine.data.GameObjectIds;
import engine.objects.Task;
import engine.data.ItemIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class Smith extends Task<ClientContext> {
    public Smith(ClientContext ctx) {
        super(ctx);
    }

    private ComponentIds cids = new ComponentIds(ctx);
    private GameObjectIds goids = new GameObjectIds(ctx);
    private ItemIds iids = new ItemIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 340 || VarpbitsArray.varpbitsArray[281] == 350;
    }

    @Override
    public void execute() {
        if (cids.backpackWindow.visible()) {
            if (VarpbitsArray.varpbitsArray[281] == 340
                    || (VarpbitsArray.varpbitsArray[281] == 350 && !cids.smithingWindow.visible())) {
                if (goids.nearestAnvil.inViewport()) {
                    ctx.camera.turnTo(goids.nearestAnvil);
                    iids.UseItem(iids.bronzeBar);
                    goids.nearestAnvil.interact("Use");
                } else {
                    ctx.camera.turnTo(goids.nearestAnvil);
                    ctx.movement.step(goids.nearestAnvil);
                }
            }
            else
                cids.daggerButton.click();
        } else {
            cids.backpackButton.click();
        }
    }
}
