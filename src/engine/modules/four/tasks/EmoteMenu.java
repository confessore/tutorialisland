package engine.modules.four.tasks;

import engine.constants.Components;
import engine.constants.Varps;
import engine.objects.Task;

import org.powerbot.script.rt4.ClientContext;

public class EmoteMenu extends Task<ClientContext> {
    public EmoteMenu(ClientContext ctx) {
        super(ctx);
    }

    private Components components = new Components(ctx);
    private Varps varps = new Varps(ctx);

    @Override
    public boolean activate() {
        return varps.get(281) == 183 && varps.get(1021) == 13;
    }

    @Override
    public void execute() {
        components.EMOTE_BUTTON.click();
    }
}
