package engine.modules.six;

import engine.Manager;
import engine.constants.Varps;
import engine.modules.six.tasks.*;
import engine.objects.Task;

import org.powerbot.script.rt4.ClientContext;

import java.util.Arrays;

public class SixController extends Task<ClientContext> {
    public SixController(ClientContext ctx) {
        super(ctx);
    }

    private Varps varps = new Varps(ctx);

    @Override
    public boolean activate() {
        return Manager.inactive(ctx) && (varps.get(281) >= 370 && varps.get(281) < 440);
    }

    @Override
    public void execute() {
        Manager.updateTasks(Arrays.asList(new CombatInstructor(ctx), new WornEquipmentMenu(ctx),
                new ViewEquipmentStats(ctx), new EquipDagger(ctx), new WieldMelee(ctx), new CombatOptionsMenu(ctx)));
    }
}
