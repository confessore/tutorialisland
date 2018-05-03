package engine.modules.six;

import engine.data.ItemIds;
import engine.objects.Task;
import engine.data.ComponentIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class EquipMelee extends Task<ClientContext> {
    public EquipMelee(ClientContext ctx) {
        super(ctx);
    }

    private ComponentIds cids = new ComponentIds(ctx);
    private ItemIds iids = new ItemIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 420;
    }

    @Override
    public void execute() {
        if (cids.backpackWindow.visible()) {
            iids.WieldItem(iids.bronzeSword);
            iids.WieldItem(iids.woodenShield);
        }
        else
            cids.backpackButton.click();
    }
}
