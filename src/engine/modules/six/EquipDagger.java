package engine.modules.six;

import engine.data.ItemIds;
import engine.objects.Task;
import engine.data.ComponentIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class EquipDagger extends Task<ClientContext> {
    public EquipDagger(ClientContext ctx) {
        super(ctx);
    }

    private ComponentIds cids = new ComponentIds(ctx);
    private ItemIds iids = new ItemIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 405;
    }

    @Override
    public void execute() {
        if (cids.equipmentStatsWindow.visible())
            iids.EquipItem(iids.bronzeDagger);
        else {
            if (cids.wornEquipmentWindow.visible())
                cids.viewEquipmentStatsButton.click();
            else
                cids.wornEquipmentButton.click();
        }
    }
}
