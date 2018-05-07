package engine.modules.four.tasks;

import engine.constants.Components;
import engine.constants.Varps;
import engine.objects.Task;

import org.powerbot.script.rt4.ClientContext;

public class QuestListMenu extends Task<ClientContext> {
    public QuestListMenu(ClientContext ctx) {
        super(ctx);
    }

    private Components components = new Components(ctx);
    private Varps varps = new Varps(ctx);

    @Override
    public boolean activate() {
        return varps.get(281) == 230 && varps.get(1021) == 3;
    }

    @Override
    public void execute() {
        components.QUESTLIST_BUTTON.click();
    }
}
