package engine.modules.two.tasks;

import engine.constants.Components;
import engine.constants.GameObjects;
import engine.constants.Items;
import engine.constants.Varps;
import engine.objects.Task;

import org.powerbot.script.rt4.ClientContext;

public class Fire extends Task<ClientContext> {
    public Fire(ClientContext ctx) {
        super(ctx);
    }

    private Components components = new Components(ctx);
    private GameObjects gameObjects = new GameObjects(ctx);
    private Items items = new Items(ctx);
    private Varps varps = new Varps(ctx);

    @Override
    public boolean activate() {
        return varps.get(281) == 50;
    }

    @Override
    public void execute() {
        if (components.BACKPACK_WINDOW.visible()) {
            if (items.existsInInventory((items.LOG))) {
                items.makeFire();
            } else {
                gameObjects.chop(gameObjects.TREE);
            }
        } else
            components.BACKPACK_BUTTON.click();
    }
}