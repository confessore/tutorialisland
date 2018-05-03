package engine.modules.two;

import engine.objects.Task;
import engine.data.ComponentIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class BackpackMenu extends Task<ClientContext> {
    public BackpackMenu(ClientContext ctx) {
        super(ctx);
    }

    private ComponentIds cids = new ComponentIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 30
                && VarpbitsArray.varpbitsArray[1021] == 4;
    }

    @Override
    public void execute() {
        cids.backpackButton.click();
    }
}