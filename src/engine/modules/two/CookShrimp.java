package engine.modules.two;

import engine.data.ComponentIds;
import engine.objects.Task;
import engine.data.GameObjectIds;
import engine.data.ItemIds;
import engine.data.NpcIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class CookShrimp extends Task<ClientContext> {
    public CookShrimp(ClientContext ctx) {
        super(ctx);
    }

    private ComponentIds cids = new ComponentIds(ctx);
    private GameObjectIds goids = new GameObjectIds(ctx);
    private ItemIds iids = new ItemIds(ctx);
    private NpcIds npcids = new NpcIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 90
                || VarpbitsArray.varpbitsArray[281] == 100
                || VarpbitsArray.varpbitsArray[281] == 110;
    }

    @Override
    public void execute() {
        if (!ctx.inventory.select().id(iids.cookedShrimp).poll().valid()) {
            if (cids.backpackWindow.visible()) {
                if (ctx.inventory.select().id(iids.rawShrimp).poll().valid()) {
                    if (goids.nearestFire.valid()) {
                        if (goids.nearestFire.inViewport()) {
                            ctx.camera.turnTo(goids.nearestFire);
                            iids.UseItem(iids.rawShrimp);
                            goids.nearestFire.interact("Use");
                        } else {
                            ctx.camera.turnTo(goids.nearestFire);
                            ctx.movement.step(goids.nearestFire);
                        }
                    } else if (ctx.inventory.select().id(iids.log).poll().valid()) {
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
                } else {
                    if (npcids.nearestFishingSpot.inViewport()) {
                        ctx.movement.step(npcids.nearestFishingSpot);
                        npcids.nearestFishingSpot.interact("Net");
                    } else {
                        ctx.camera.turnTo(npcids.nearestFishingSpot);
                        ctx.movement.step(npcids.nearestFishingSpot);
                    }
                }
            } else
                cids.backpackButton.click();
        }
    }
}
