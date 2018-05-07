package engine.modules.three.tasks;

import engine.constants.Components;
import engine.constants.Items;
import engine.constants.Varps;
import engine.objects.Task;

import org.powerbot.script.rt4.ClientContext;

public class Dough extends Task<ClientContext> {
    public Dough(ClientContext ctx) {
        super(ctx);
    }

    private Components components = new Components(ctx);
    private Items items = new Items(ctx);
    private Varps varps = new Varps(ctx);

    @Override
    public boolean activate() {
        return varps.get(281) == 150;
    }

    @Override
    public void execute() {
        if (components.BACKPACK_WINDOW.visible())
            items.makeDough();
        else
            components.BACKPACK_BUTTON.click();
    }
}
