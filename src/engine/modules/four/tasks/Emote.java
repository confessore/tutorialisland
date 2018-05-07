package engine.modules.four.tasks;

import engine.constants.Components;
import engine.constants.Varps;
import engine.objects.Task;

import org.powerbot.script.rt4.ClientContext;

public class Emote extends Task<ClientContext> {
    public Emote(ClientContext ctx) {
        super(ctx);
    }

    private Components components = new Components(ctx);
    private Varps varps = new Varps(ctx);

    @Override
    public boolean activate() {
        return varps.get(281) == 187;
    }

    @Override
    public void execute() {
        if (components.EMOTE_WINDOW.visible())
            components.EMOTE_RANDOM.click();
        else
            components.EMOTE_BUTTON.click();
    }
}
