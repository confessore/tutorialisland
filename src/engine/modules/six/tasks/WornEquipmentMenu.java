package engine.modules.six.tasks;

import engine.constants.Components;
import engine.constants.Varps;
import engine.objects.Task;

import org.powerbot.script.rt4.ClientContext;

public class WornEquipmentMenu extends Task<ClientContext> {
    public WornEquipmentMenu(ClientContext ctx) {
        super(ctx);
    }

    private Components components = new Components(ctx);
    private Varps varps = new Varps(ctx);

    @Override
    public boolean activate() {
        return varps.get(281) == 390 && varps.get(1021) == 5;
    }

    @Override
    public void execute() {
        components.WORNEQUIPMENT_BUTTON.click();
    }
}
