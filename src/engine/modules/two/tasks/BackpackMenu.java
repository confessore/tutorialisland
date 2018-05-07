package engine.modules.two.tasks;

import engine.constants.Components;
import engine.constants.Varps;
import engine.objects.Task;

import org.powerbot.script.rt4.ClientContext;

public class BackpackMenu extends Task<ClientContext> {
    public BackpackMenu(ClientContext ctx) {
        super(ctx);
    }

    private Components components = new Components(ctx);
    private Varps varps = new Varps(ctx);

    @Override
    public boolean activate() {
        return varps.get(281) == 30 && varps.get(1021) == 4;
    }

    @Override
    public void execute() {
        components.BACKPACK_BUTTON.click();
    }
}
