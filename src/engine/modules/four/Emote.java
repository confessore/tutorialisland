package engine.modules.four;

import engine.objects.Task;
import engine.data.ComponentIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class Emote extends Task<ClientContext> {
    public Emote(ClientContext ctx) {
        super(ctx);
    }

    private ComponentIds cids = new ComponentIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 187;
    }

    @Override
    public void execute() {
        if (cids.emoteWindow.visible())
            cids.randomEmote.click();
        else
            cids.emoteButton.click();
    }
}
