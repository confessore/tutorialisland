package engine.modules.two;

import engine.objects.Task;
import engine.data.GameObjectIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class Tree extends Task<ClientContext> {
    public Tree(ClientContext ctx) {
        super(ctx);
    }

    private GameObjectIds goids = new GameObjectIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 40;
    }

    @Override
    public void execute() {
        if (goids.nearestTree.inViewport()) {
            ctx.camera.turnTo(goids.nearestTree);
            goids.nearestTree.interact("Chop down");
        } else {
            ctx.camera.turnTo(goids.nearestTree);
            ctx.movement.step(goids.nearestTree);
        }
    }
}
