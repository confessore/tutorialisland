package engine.modules.two.tasks;

import engine.constants.GameObjects;
import engine.constants.Varps;
import engine.objects.Task;

import org.powerbot.script.rt4.ClientContext;

public class Tree extends Task<ClientContext> {
    public Tree(ClientContext ctx) {
        super(ctx);
    }

    private GameObjects gameObjects = new GameObjects(ctx);
    private Varps varps = new Varps(ctx);

    @Override
    public boolean activate() {
        return varps.get(281) == 40;
    }

    @Override
    public void execute() {
        gameObjects.chop(gameObjects.TREE);
    }
}
