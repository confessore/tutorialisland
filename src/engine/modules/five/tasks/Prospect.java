package engine.modules.five.tasks;

import engine.constants.GameObjects;
import engine.constants.Varps;
import engine.objects.Task;

import org.powerbot.script.rt4.ClientContext;

public class Prospect extends Task<ClientContext> {
    public Prospect(ClientContext ctx) {
        super(ctx);
    }

    private GameObjects gameObjects = new GameObjects(ctx);
    private Varps varps = new Varps(ctx);

    @Override
    public boolean activate() {
        return varps.get(281) == 270 || varps.get(281) == 280 || varps.get(281) == 281;
    }

    @Override
    public void execute() {
        if (varps.get(281) == 270 || varps.get(281) == 281)
            gameObjects.prospect(gameObjects.TIN_VEIN);
        else
            gameObjects.prospect(gameObjects.COPPER_VEIN);
    }
}
