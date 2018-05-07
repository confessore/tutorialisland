package engine.modules.one;

import engine.Manager;
import engine.constants.Varps;
import engine.modules.one.tasks.*;
import engine.objects.Task;

import org.powerbot.script.rt4.ClientContext;

import java.util.Arrays;

public class OneController extends Task<ClientContext> {
    public OneController(ClientContext ctx) {
        super(ctx);
    }

    private Varps varps = new Varps(ctx);

    @Override
    public boolean activate() {
        return Manager.inactive(ctx) && (varps.get(281) >= -1 && varps.get(281) < 20);
    }

    @Override
    public void execute() {
        Manager.updateTasks(Arrays.asList(new RSGuide(ctx), new OptionsMenu1(ctx), new Door1(ctx)));
    }
}
