package engine.modules.three.tasks;

import engine.constants.NPCs;
import engine.constants.Varps;
import engine.objects.Task;

import org.powerbot.script.rt4.ClientContext;

public class MasterChef extends Task<ClientContext> {
    public MasterChef(ClientContext ctx) {
        super(ctx);
    }

    private NPCs npcs = new NPCs(ctx);
    private Varps varps = new Varps(ctx);

    @Override
    public boolean activate() {
        return varps.get(281) == 140;
    }

    @Override
    public void execute() {
        npcs.talk(npcs.MASTER_CHEF);
    }
}
