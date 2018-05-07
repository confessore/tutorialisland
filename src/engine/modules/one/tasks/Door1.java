package engine.modules.one.tasks;

import engine.constants.Varps;
import engine.objects.Task;
import engine.constants.GameObjects;

import org.powerbot.script.rt4.ClientContext;

public class Door1 extends Task<ClientContext> {
    public Door1(ClientContext ctx) {
        super(ctx);
    }

    private GameObjects gameObjects = new GameObjects(ctx);
    private Varps varps = new Varps(ctx);

    @Override
    public boolean activate() {
        return varps.get(281) == 10;
    }

    @Override
    public void execute() {
        gameObjects.open(gameObjects.DOOR1);
    }
}
