package engine.modules.eight.tasks;

import engine.constants.GameObjects;
import engine.constants.Varps;
import engine.objects.Task;

import org.powerbot.script.rt4.ClientContext;

public class Bank extends Task<ClientContext> {
    public Bank(ClientContext ctx) {
        super(ctx);
    }

    private GameObjects gameObjects = new GameObjects(ctx);
    private Varps varps = new Varps(ctx);

    @Override
    public boolean activate() {
        return varps.get(281) == 510;
    }

    @Override
    public void execute() {
        gameObjects.use(gameObjects.BANK);
    }
}
