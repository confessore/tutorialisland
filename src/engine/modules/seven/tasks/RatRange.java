package engine.modules.seven.tasks;

import engine.constants.Components;
import engine.constants.Items;
import engine.constants.NPCs;
import engine.constants.Varps;
import engine.objects.Task;

import org.powerbot.script.rt4.ClientContext;

public class RatRange extends Task<ClientContext> {
    public RatRange(ClientContext ctx) {
        super(ctx);
    }

    private Components components = new Components(ctx);
    private Items items = new Items(ctx);
    private NPCs npcs = new NPCs(ctx);
    private Varps varps = new Varps(ctx);

    @Override
    public boolean activate() {
        return varps.get(281) == 480 || varps.get(281) == 490;
    }

    @Override
    public void execute() {
        if (components.BACKPACK_WINDOW.visible()) {
            if (varps.get(843) == 3) {
                items.wield(items.BRONZE_ARROWS);
                npcs.attack(npcs.GIANT_RAT);
            } else {
                items.wield(items.BRONZE_ARROWS);
                items.wield(items.SHORT_BOW);
            }
        } else
            components.BACKPACK_BUTTON.click();
    }
}
