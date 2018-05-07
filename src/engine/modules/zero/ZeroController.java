package engine.modules.zero;

import engine.Manager;
import engine.modules.zero.tasks.*;
import engine.objects.Task;

import org.powerbot.script.rt4.ClientContext;

import java.util.Arrays;

public class ZeroController extends Task<ClientContext> {
    public ZeroController(ClientContext ctx) {
        super(ctx);
    }

    @Override
    public boolean activate() {
        return new Audio(ctx).activate() || new Camera(ctx).activate() || new Chatter(ctx).activate()
                || new Run(ctx).activate() || new Designer(ctx).activate();
    }

    @Override
    public void execute() {
        Manager.updateTasks(Arrays.asList(new Audio(ctx), new Camera(ctx), new Chatter(ctx), new Run(ctx),
                new Designer(ctx)));
    }
}
