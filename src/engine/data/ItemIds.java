package engine.data;

import engine.objects.Context;

import org.powerbot.script.rt4.ClientContext;

public class ItemIds extends Context<ClientContext> {
    public ItemIds(ClientContext ctx) {
        super(ctx);
    }

    public final int tinderbox = 590;
    public final int log = 2511;
    public final int rawShrimp = 2514;
    public final int cookedShrimp = 315;
    public final int potOfFlour = 2516;
    public final int bucketOfWater = 1929;
    public final int breadDough = 2307;
    public final int tinOre = 438;
    public final int copperOre = 436;
    public final int bronzeBar = 2349;
    public final int bronzeDagger = 1205;
    public final int bronzeSword = 1277;
    public final int woodenShield = 1171;
    public final int shortBow = 841;
    public final int bronzeArrows =  882;

    public void EquipItem(int item) { ctx.inventory.select().id(item).poll().interact("Equip"); }

    public void UseItem(int item) {
        ctx.inventory.select().id(item).poll().interact("Use");
    }

    public void WieldItem(int item) {
        ctx.inventory.select().id(item).poll().interact("Wield");
    }
}
