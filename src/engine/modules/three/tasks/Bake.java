package engine.modules.three.tasks;

import engine.constants.Components;
import engine.constants.GameObjects;
import engine.constants.Items;
import engine.constants.Varps;
import engine.objects.Task;

import org.powerbot.script.rt4.ClientContext;

public class Bake extends Task<ClientContext> {
    public Bake(ClientContext ctx) {
        super(ctx);
    }

    private Components components = new Components(ctx);
    private GameObjects gameObjects = new GameObjects(ctx);
    private Items items = new Items(ctx);
    private Varps varps = new Varps(ctx);

    @Override
    public boolean activate() {
        return varps.get(281) == 160;
    }

    @Override
    public void execute() {
        if (components.BACKPACK_WINDOW.visible()) {
            items.use(items.BREAD_DOUGH);
            gameObjects.use(gameObjects.RANGE);
        } else
            components.BACKPACK_BUTTON.click();
    }
}
