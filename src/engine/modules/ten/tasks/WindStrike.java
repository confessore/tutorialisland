package engine.modules.ten.tasks;

import engine.constants.Components;
import engine.constants.NPCs;
import engine.constants.Varps;
import engine.objects.Task;

import org.powerbot.script.rt4.ClientContext;

public class WindStrike extends Task<ClientContext> {
    public WindStrike(ClientContext ctx) {
        super(ctx);
    }

    private Components components = new Components(ctx);
    private NPCs npcs = new NPCs(ctx);
    private Varps varps = new Varps(ctx);

    @Override
    public boolean activate() {
        return varps.get(281) == 650;
    }

    @Override
    public void execute() {
        components.cast(components.MAGIC_WINDSTRIKE_BUTTON, npcs.CHICKEN);
    }
}
