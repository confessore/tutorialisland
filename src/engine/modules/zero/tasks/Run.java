package engine.modules.zero.tasks;

import engine.constants.Components;
import engine.constants.Varps;
import engine.objects.Task;

import org.powerbot.script.rt4.ClientContext;

public class Run extends Task<ClientContext> {
    public Run(ClientContext ctx) {
        super(ctx);
    }

    private Components components = new Components(ctx);
    private Varps varps = new Varps(ctx);

    @Override
    public boolean activate() {
        return varps.OPTIONS_TOGGLED && varps.RUN_OFF && ctx.movement.energyLevel() > 49;
    }

    @Override
    public void execute() {
        components.RUN_BUTTON.click();
    }
}
