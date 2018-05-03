package engine.modules.zero;

import engine.data.ComponentIds;
import engine.objects.Task;

import org.powerbot.script.rt4.ClientContext;

public class Run extends Task<ClientContext> {
    public Run(ClientContext ctx) {
        super(ctx);
    }

    private ComponentIds cids = new ComponentIds(ctx);

    @Override
    public boolean activate() {
        return true;
    }

    @Override
    public void execute() {
        cids.runButton.click();
    }
}
