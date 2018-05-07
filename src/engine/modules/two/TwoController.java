package engine.modules.two;

import engine.Manager;
import engine.constants.Varps;
import engine.modules.two.tasks.*;
import engine.objects.Task;

import org.powerbot.script.rt4.ClientContext;

import java.util.Arrays;

public class TwoController extends Task<ClientContext> {
    public TwoController(ClientContext ctx) {
        super(ctx);
    }

    private Varps varps = new Varps(ctx);

    @Override
    public boolean activate() {
        return Manager.inactive(ctx) && (varps.get(281) >= 20 && varps.get(281) < 130);
    }

    @Override
    public void execute() {
        Manager.updateTasks(Arrays.asList(new SurvivalExpert(ctx), new BackpackMenu(ctx), new Tree(ctx),
                new Fire(ctx), new StatsMenu(ctx), new Fish(ctx), new Cook(ctx), new Gate1(ctx)));
    }
}
