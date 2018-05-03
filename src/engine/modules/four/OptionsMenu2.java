package engine.modules.four;

import engine.objects.Task;
import engine.data.ComponentIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class OptionsMenu2 extends Task<ClientContext> {
    public OptionsMenu2(ClientContext ctx) {
        super(ctx);
    }

    private ComponentIds cids = new ComponentIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 190
                && VarpbitsArray.varpbitsArray[1021] == 12;
    }

    @Override
    public void execute() {
        cids.optionsButton.click();
    }
}
