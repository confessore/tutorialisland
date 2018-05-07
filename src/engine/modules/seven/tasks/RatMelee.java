package engine.modules.seven.tasks;

import engine.constants.NPCs;
import engine.constants.Varps;
import engine.objects.Task;

import org.powerbot.script.rt4.ClientContext;

public class RatMelee extends Task<ClientContext> {
    public RatMelee(ClientContext ctx) {
        super(ctx);
    }

    private NPCs npcs = new NPCs(ctx);
    private Varps varps = new Varps(ctx);

    @Override
    public boolean activate() {
        return varps.get(281) == 450 || varps.get(281) == 460;
    }

    @Override
    public void execute() {
        npcs.attack(npcs.GIANT_RAT);
    }
}
