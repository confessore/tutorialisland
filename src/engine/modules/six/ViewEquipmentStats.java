package engine.modules.six;

import engine.objects.Task;
import engine.data.ComponentIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class ViewEquipmentStats extends Task<ClientContext> {
    public ViewEquipmentStats(ClientContext ctx) {
        super(ctx);
    }

    private ComponentIds cids = new ComponentIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 400;
    }

    @Override
    public void execute() {
        if (cids.wornEquipmentWindow.visible())
            cids.viewEquipmentStatsButton.click();
        else
            cids.wornEquipmentButton.click();
    }
}
