package engine.modules.nine;

import engine.objects.Task;
import engine.data.ComponentIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class IgnoredMenu extends Task<ClientContext> {
    public IgnoredMenu(ClientContext ctx) {
        super(ctx);
    }

    private ComponentIds cids = new ComponentIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 590
                && VarpbitsArray.varpbitsArray[1021] == 10;
    }

    @Override
    public void execute() {
        cids.ignoredButton.click();
    }
}
