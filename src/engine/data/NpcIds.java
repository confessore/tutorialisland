package engine.data;

import engine.objects.Context;

import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.Npc;

public class NpcIds extends Context<ClientContext> {
    public NpcIds(ClientContext ctx) {
        super(ctx);
    }

    public final Npc nearestRuneScapeGuide = ctx.npcs.select().id(3308).nearest().poll();
    public final Npc nearestSurvivalExpert = ctx.npcs.select().id(3306).nearest().poll();
    public final Npc nearestFishingSpot = ctx.npcs.select().id(3317).nearest().poll();
    public final Npc nearestMasterChef = ctx.npcs.select().id(3305).nearest().poll();
    public final Npc nearestQuestGuide = ctx.npcs.select().id(3312).nearest().poll();
    public final Npc nearestMiningInstructor = ctx.npcs.select().id(3311).nearest().poll();
    public final Npc nearestCombatInstructor = ctx.npcs.select().id(3307).nearest().poll();
    public final Npc nearestGiantRat = ctx.npcs.select().id(3313).nearest().poll();
    public final Npc nearestFinancialAdvisor = ctx.npcs.select().id(3310).nearest().poll();
    public final Npc nearestBrotherBrace = ctx.npcs.select().id(3319).nearest().poll();
    public final Npc nearestMagicInstructor = ctx.npcs.select().id(3309).nearest().poll();
    public final Npc nearestChicken = ctx.npcs.select().id(3316).nearest().poll();
}
