package engine.modules.ten.tasks;

import engine.constants.Components;
import engine.constants.Varps;
import engine.objects.Task;

import org.powerbot.script.rt4.ClientContext;

public class MagicMenu extends Task<ClientContext> {
    public MagicMenu(ClientContext ctx) {
        super(ctx);
    }

    private Components components = new Components(ctx);
    private Varps varps = new Varps(ctx);

    @Override
    public boolean activate() {
        return varps.get(281) == 630 && varps.get(1021) == 7;
    }

    @Override
    public void execute() {
        components.MAGIC_BUTTON.click();
    }
}
