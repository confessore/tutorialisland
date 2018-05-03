package engine.modules.three;

import engine.data.ComponentIds;
import engine.objects.Task;
import engine.data.ItemIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class Dough extends Task<ClientContext> {
    public Dough(ClientContext ctx) {
        super(ctx);
    }

    private ComponentIds cids = new ComponentIds(ctx);
    private ItemIds iids = new ItemIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 150;
    }

    @Override
    public void execute() {
        if (cids.backpackWindow.visible()) {
            iids.UseItem(iids.potOfFlour);
            iids.UseItem(iids.bucketOfWater);
        }
        else
            cids.backpackButton.click();
    }
}
