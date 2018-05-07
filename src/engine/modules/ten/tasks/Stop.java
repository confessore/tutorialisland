package engine.modules.ten.tasks;

import engine.constants.Varps;
import engine.objects.Task;

import org.powerbot.script.rt4.ClientContext;

public class Stop extends Task<ClientContext> {
    public Stop(ClientContext ctx) {
        super(ctx);
    }

    private Varps varps = new Varps(ctx);

    @Override
    public boolean activate() {
        return varps.get(281) == 1000;
    }

    @Override
    public void execute() {
        ctx.controller.stop();
    }
}
