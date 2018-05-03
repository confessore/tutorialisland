package engine.data;

import engine.objects.Context;

import org.powerbot.script.Random;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.Component;

public class ComponentIds extends Context<ClientContext> {
    public ComponentIds(ClientContext ctx) {
        super(ctx);
    }

    public final Component errorContinueButton = ctx.widgets.component(162, 37);
    public final Component optionsButton = ctx.widgets.component(548, 42);
    public final Component optionsWindow = ctx.widgets.component(548, 77);
    public final Component audioButton = ctx.widgets.component(261, 1).component(2);
    public final Component audioSlider0 = ctx.widgets.component(261, 24);
    public final Component backpackButton = ctx.widgets.component(548, 51);
    public final Component backpackWindow = ctx.widgets.component(548, 69);
    public final Component statsButton = ctx.widgets.component(548, 56);
    public final Component musicPlayerButton = ctx.widgets.component(548, 44);
    public final Component emoteButton = ctx.widgets.component(548, 43);
    public final Component emoteWindow = ctx.widgets.component(548, 78);
    public final Component randomEmote = ctx.widgets.component(216, 1).component(Random.nextInt(0, 21));
    public final Component runButton = ctx.widgets.component(160, 24);
    public final Component questListButton = ctx.widgets.component(548, 57);
    public final Component smithingWindow = ctx.widgets.component(312, 1);
    public final Component daggerButton = ctx.widgets.component(312, 2).component(2);
    public final Component wornEquipmentButton = ctx.widgets.component(548, 59);
    public final Component wornEquipmentWindow = ctx.widgets.component(387, 0);
    public final Component viewEquipmentStatsButton = ctx.widgets.component(387, 17);
    public final Component equipmentStatsWindow = ctx.widgets.component(84, 1);
    public final Component equipmentStatsWindowCloseButton = ctx.widgets.component(84, 4);
    public final Component combatOptionsButton = ctx.widgets.component(548, 55);
    public final Component mainHand = ctx.widgets.component(387, 9);
    public final Component arrows = ctx.widgets.component(387, 16);
    public final Component clickContinue = ctx.widgets.component(193, 2);
    public final Component prayerButton = ctx.widgets.component(548, 53);
    public final Component friendsButton = ctx.widgets.component(548, 39);
    public final Component ignoredButton = ctx.widgets.component(548, 40);
    public final Component magicButton = ctx.widgets.component(548, 61);
    public final Component magicWindow = ctx.widgets.component(218, 0);
    public final Component spellWindStrike = ctx.widgets.component(218, 2);
}
