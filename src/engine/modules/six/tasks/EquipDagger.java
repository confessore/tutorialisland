package engine.modules.six.tasks;

import engine.constants.Components;
import engine.constants.Items;
import engine.constants.Varps;
import engine.objects.Task;

import org.powerbot.script.rt4.ClientContext;

public class EquipDagger extends Task<ClientContext> {
    public EquipDagger(ClientContext ctx) {
        super(ctx);
    }

    private Components components = new Components(ctx);
    private Items items = new Items(ctx);
    private Varps varps = new Varps(ctx);

    @Override
    public boolean activate() {
        return varps.get(281) == 405;
    }

    @Override
    public void execute() {
        if (components.EQUIPMENTSTATS_WINDOW.visible())
            items.equip(items.BRONZE_DAGGER);
        else {
            if (components.WORNEQUIPMENT_WINDOW.visible())
                components.EQUIPMENTSTATS_BUTTON.click();
            else
                components.WORNEQUIPMENT_BUTTON.click();
        }
    }
}
