package engine.modules.seven;

import engine.data.ItemIds;
import engine.data.NpcIds;
import engine.objects.Task;
import engine.data.ComponentIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class RatRange extends Task<ClientContext> {
    public RatRange(ClientContext ctx) {
        super(ctx);
    }

    private ComponentIds cids = new ComponentIds(ctx);
    private ItemIds iids = new ItemIds(ctx);
    private NpcIds npcids = new NpcIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 480 || VarpbitsArray.varpbitsArray[281] == 490;
    }

    @Override
    public void execute() {
        if (VarpbitsArray.varpbitsArray[843] == 3) {
            if (cids.backpackWindow.visible())
                iids.WieldItem(iids.bronzeArrows);
            else
                cids.backpackButton.click();
            if (npcids.nearestGiantRat.inViewport()) {
                ctx.camera.turnTo(npcids.nearestGiantRat);
                npcids.nearestGiantRat.interact("Attack");
            } else {
                ctx.camera.turnTo(npcids.nearestGiantRat);
                ctx.movement.step(npcids.nearestGiantRat);
            }
        } else {
            if (cids.backpackWindow.visible()) {
                iids.WieldItem(iids.bronzeArrows);
                iids.WieldItem(iids.shortBow);
            } else
                cids.backpackButton.click();
        }
    }
}
