package engine.modules.zero;

import engine.data.ComponentIds;
import engine.objects.Task;

import org.powerbot.script.rt4.ClientContext;

public class Audio extends Task<ClientContext> {
    public Audio(ClientContext ctx) {
        super(ctx);
    }

    ComponentIds cids = new ComponentIds(ctx);

    @Override
    public boolean activate() {
        return true;
    }

    @Override
    public void execute() {
        if (!cids.optionsWindow.visible())
            cids.optionsButton.click();
        else {
            cids.audioButton.click();
            cids.audioSlider0.click();
        }
    }
}
