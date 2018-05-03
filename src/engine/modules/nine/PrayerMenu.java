package engine.modules.nine;

import engine.objects.Task;
import engine.data.ComponentIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class PrayerMenu extends Task<ClientContext> {
    public PrayerMenu(ClientContext ctx) {
        super(ctx);
    }

    private ComponentIds cids = new ComponentIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 560
                && VarpbitsArray.varpbitsArray[1021] == 6;
    }

    @Override
    public void execute() {
        cids.prayerButton.click();
    }
}
