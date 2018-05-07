package engine.modules.two.tasks;

import engine.constants.Components;
import engine.constants.Varps;
import engine.objects.Task;

import org.powerbot.script.rt4.ClientContext;

public class StatsMenu extends Task<ClientContext> {
    public StatsMenu(ClientContext ctx) {
        super(ctx);
    }

    private Components components = new Components(ctx);
    private Varps varps = new Varps(ctx);

    @Override
    public boolean activate() {
        return varps.get(281) == 60 && varps.get(1021) == 2;
    }

    @Override
    public void execute() {
        components.STATS_BUTTON.click();
    }
}
