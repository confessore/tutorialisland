package engine.modules.seven;

import engine.data.NpcIds;
import engine.objects.Task;
import engine.data.GameObjectIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.Area;
import org.powerbot.script.Tile;
import org.powerbot.script.rt4.ClientContext;

public class Gate3 extends Task<ClientContext> {
    public Gate3(ClientContext ctx) {
        super(ctx);
    }

    private GameObjectIds goids = new GameObjectIds(ctx);
    private NpcIds npcids = new NpcIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 440 || VarpbitsArray.varpbitsArray[281] == 470;
    }

    @Override
    public void execute() {
        if (VarpbitsArray.varpbitsArray[281] == 440) {
            if (goids.nearestGate3.inViewport()) {
                ctx.camera.turnTo(goids.nearestGate3);
                goids.nearestGate3.interact("Open");
            } else {
                ctx.camera.turnTo(goids.nearestGate3);
                ctx.movement.step(goids.nearestGate3);
            }
        }
        else {
            if (new Area(new Tile(3111, 9523), new Tile(3098, 9515/*3098, 9515*/)).contains(ctx.players.local())) {
                if (goids.nearestGate3.inViewport()) {
                    ctx.camera.turnTo(goids.nearestGate3);
                    goids.nearestGate3.interact("Open");
                } else {
                    ctx.camera.turnTo(goids.nearestGate3);
                    ctx.movement.step(goids.nearestGate3);
                }
            } else {
                if (npcids.nearestCombatInstructor.inViewport()) {
                    ctx.camera.turnTo(npcids.nearestCombatInstructor);
                    npcids.nearestCombatInstructor.interact("Talk-to");
                } else {
                    ctx.camera.turnTo(npcids.nearestCombatInstructor);
                    ctx.movement.step(npcids.nearestCombatInstructor);
                }
            }
        }
    }
}
