package engine.data;

import engine.objects.Context;

import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.GameObject;

public class GameObjectIds extends Context<ClientContext> {
    public GameObjectIds(ClientContext ctx) {
        super(ctx);
    }

    public final GameObject nearestDoor1 = ctx.objects.select().id(9398).nearest().poll();
    public final GameObject nearestTree = ctx.objects.select().id(9730).nearest().poll();
    public final GameObject nearestFire = ctx.objects.select().id(26185).nearest().poll();
    public final GameObject nearestGate1 = ctx.objects.select().id(9708, 9470).nearest().poll();
    public final GameObject nearestDoor2 = ctx.objects.select().id(9709).nearest().poll();
    public final GameObject nearestRange = ctx.objects.select().id(9736).nearest().poll();
    public final GameObject nearestDoor3 = ctx.objects.select().id(9710).nearest().poll();
    public final GameObject nearestDoor4 = ctx.objects.select().id(9716).nearest().poll();
    public final GameObject nearestLadder1 = ctx.objects.select().id(9726).nearest().poll();
    public final GameObject nearestTinVein = ctx.objects.select().id(10080).nearest().poll();
    public final GameObject nearestCopperVein = ctx.objects.select().id(10079).nearest().poll();
    public final GameObject nearestFurnace = ctx.objects.select().id(10082).nearest().poll();
    public final GameObject nearestAnvil = ctx.objects.select().id(2097).nearest().poll();
    public final GameObject nearestGate2 = ctx.objects.select().id(9717).nearest().poll();
    public final GameObject nearestGate3 = ctx.objects.select().id(9719, 9720).nearest().poll();
    public final GameObject nearestLadder2 = ctx.objects.select().id(9727).nearest().poll();
    public final GameObject nearestBank = ctx.objects.select().id(10083).nearest().poll();
    public final GameObject nearestPoll = ctx.objects.select().id(26801).nearest().poll();
    public final GameObject nearestDoor5 = ctx.objects.select().id(9721).nearest().poll();
    public final GameObject nearestDoor6 = ctx.objects.select().id(9722).nearest().poll();
    public final GameObject nearestLargeDoorClosed = ctx.objects.select().id(1521, 1524).nearest().poll();
    public final GameObject nearestLargeDoorOpen = ctx.objects.select().id(1522, 1525).nearest().poll();
    public final GameObject nearestDoor7 = ctx.objects.select().id(9723).nearest().poll();
}
