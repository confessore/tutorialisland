package engine.modules.four;

import engine.Manager;
import engine.constants.Varps;
import engine.modules.four.tasks.*;
import engine.objects.Task;

import org.powerbot.script.rt4.ClientContext;

import java.util.Arrays;

public class FourController extends Task<ClientContext> {
    public FourController(ClientContext ctx) {
        super(ctx);
    }

    private Varps varps = new Varps(ctx);

    @Override
    public boolean activate() {
        return Manager.inactive(ctx) && (varps.get(281) >= 183 && varps.get(281) < 260);
    }

    @Override
    public void execute() {
        Manager.updateTasks(Arrays.asList(new EmoteMenu(ctx), new Emote(ctx), new OptionsMenu2(ctx), new Door4(ctx),
                new QuestGuide(ctx), new QuestListMenu(ctx), new Ladder1(ctx)));
    }
}
