package engine.modules.six;

import engine.objects.Task;
import engine.data.ComponentIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class WornEquipmentMenu extends Task<ClientContext> {
    public WornEquipmentMenu(ClientContext ctx) {
        super(ctx);
    }

    private ComponentIds cids = new ComponentIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 390
                && VarpbitsArray.varpbitsArray[1021] == 5;
    }

    @Override
    public void execute() {
        cids.wornEquipmentButton.click();
    }
}
