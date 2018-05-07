package engine.modules.four.tasks;

import engine.constants.GameObjects;
import engine.constants.Varps;
import engine.objects.Task;

import org.powerbot.script.rt4.ClientContext;

public class Ladder1 extends Task<ClientContext> {
    public Ladder1(ClientContext ctx) {
        super(ctx);
    }

    private GameObjects gameObjects = new GameObjects(ctx);
    private Varps varps = new Varps(ctx);

    @Override
    public boolean activate() {
        return varps.get(281) == 250;
    }

    @Override
    public void execute() {
        gameObjects.climbDown(gameObjects.LADDER1);
    }
}
