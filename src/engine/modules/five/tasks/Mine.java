package engine.modules.five.tasks;

import engine.constants.GameObjects;
import engine.constants.Varps;
import engine.objects.Task;

import org.powerbot.script.rt4.ClientContext;

public class Mine extends Task<ClientContext> {
    public Mine(ClientContext ctx) {
        super(ctx);
    }

    private GameObjects gameObjects = new GameObjects(ctx);
    private Varps varps = new Varps(ctx);

    @Override
    public boolean activate() {
        return varps.get(281) == 300 || varps.get(281) == 310 || varps.get(281) == 311;
    }

    @Override
    public void execute() {
        if (varps.get(281) == 300 || varps.get(281) == 311)
            gameObjects.mine(gameObjects.TIN_VEIN);
        else
            gameObjects.mine(gameObjects.COPPER_VEIN);
    }
}
