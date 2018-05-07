package engine.modules.nine;

import engine.Manager;
import engine.constants.Varps;
import engine.modules.nine.tasks.*;
import engine.objects.Task;

import org.powerbot.script.rt4.ClientContext;

import java.util.Arrays;

public class NineController extends Task<ClientContext> {
    public NineController(ClientContext ctx) {
        super(ctx);
    }

    private Varps varps = new Varps(ctx);

    @Override
    public boolean activate() {
        return Manager.inactive(ctx) && (varps.get(281) >= 550 && varps.get(281) < 620);
    }

    @Override
    public void execute() {
        Manager.updateTasks(Arrays.asList(new BrotherBrace(ctx), new PrayerMenu(ctx), new FriendsMenu(ctx),
                new IgnoredMenu(ctx), new Door7(ctx)));
    }
}
