package engine.modules.four;

import engine.objects.Task;
import engine.data.ComponentIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class EmoteMenu extends Task<ClientContext> {
    public EmoteMenu(ClientContext ctx) {
        super(ctx);
    }

    private ComponentIds cids = new ComponentIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 183
                && VarpbitsArray.varpbitsArray[1021] == 13;
    }

    @Override
    public void execute() {
        cids.emoteButton.click();
    }
}
