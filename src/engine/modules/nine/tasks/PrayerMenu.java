package engine.modules.nine.tasks;

import engine.constants.Components;
import engine.constants.Varps;
import engine.objects.Task;

import org.powerbot.script.rt4.ClientContext;

public class PrayerMenu extends Task<ClientContext> {
    public PrayerMenu(ClientContext ctx) {
        super(ctx);
    }

    private Components components = new Components(ctx);
    private Varps varps = new Varps(ctx);

    @Override
    public boolean activate() {
        return varps.get(281) == 560 && varps.get(1021) == 6;
    }

    @Override
    public void execute() {
        components.PRAYER_BUTTON.click();
    }
}
