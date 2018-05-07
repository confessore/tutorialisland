package engine.modules.nine.tasks;

import engine.constants.Components;
import engine.constants.Varps;
import engine.objects.Task;

import org.powerbot.script.rt4.ClientContext;

public class IgnoredMenu extends Task<ClientContext> {
    public IgnoredMenu(ClientContext ctx) {
        super(ctx);
    }

    private Components components = new Components(ctx);
    private Varps varps = new Varps(ctx);

    @Override
    public boolean activate() {
        return varps.get(281) == 590 && varps.get(1021) == 10;
    }

    @Override
    public void execute() {
        components.IGNORED_BUTTON.click();
    }
}
