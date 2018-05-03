package engine.modules.three;

import engine.objects.Task;
import engine.data.ComponentIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class MusicPlayerMenu extends Task<ClientContext> {
    public MusicPlayerMenu(ClientContext ctx) {
        super(ctx);
    }

    private ComponentIds cids = new ComponentIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 170
                && VarpbitsArray.varpbitsArray[1021] == 14;
    }

    @Override
    public void execute() {
        cids.musicPlayerButton.click();
    }
}
