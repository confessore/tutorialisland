package engine.modules.eight;

import engine.Manager;
import engine.constants.Varps;
import engine.modules.eight.tasks.*;
import engine.objects.Task;

import org.powerbot.script.rt4.ClientContext;

import java.util.Arrays;

public class EightController extends Task<ClientContext> {
    public EightController(ClientContext ctx) {
        super(ctx);
    }

    private Varps varps = new Varps(ctx);

    @Override
    public boolean activate() {
        return Manager.inactive(ctx) && (varps.get(281) >= 510 && varps.get(281) < 550);
    }

    @Override
    public void execute() {
        Manager.updateTasks(Arrays.asList(new Bank(ctx), new Poll(ctx), new Door5(ctx), new FinancialAdvisor(ctx),
                new Door6(ctx)));
    }
}
