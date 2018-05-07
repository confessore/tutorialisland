package engine.modules.ten;

import engine.Manager;
import engine.constants.Varps;
import engine.modules.ten.tasks.*;
import engine.objects.Task;

import org.powerbot.script.rt4.ClientContext;

import java.util.Arrays;

public class TenController extends Task<ClientContext> {
    public TenController(ClientContext ctx) {
        super(ctx);
    }

    private Varps varps = new Varps(ctx);

    @Override
    public boolean activate() {
        return Manager.inactive(ctx) && (varps.get(281) >= 620 && varps.get(281) < 1001);
    }

    @Override
    public void execute() {
        Manager.updateTasks(Arrays.asList(new MagicInstructor(ctx), new MagicMenu(ctx), new WindStrike(ctx),
                new Stop(ctx)));
    }
}
