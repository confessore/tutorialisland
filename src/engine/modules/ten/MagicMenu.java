package engine.modules.ten;

import engine.objects.Task;
import engine.data.ComponentIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class MagicMenu extends Task<ClientContext> {
    public MagicMenu(ClientContext ctx) {
        super(ctx);
    }

    private ComponentIds cids = new ComponentIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 630
                && VarpbitsArray.varpbitsArray[1021] == 7;
    }

    @Override
    public void execute() {
        cids.magicButton.click();
    }
}
