package engine.modules.five.tasks;

import engine.constants.NPCs;
import engine.constants.Varps;
import engine.objects.Task;

import org.powerbot.script.rt4.ClientContext;

public class MiningInstructor extends Task<ClientContext> {
    public MiningInstructor(ClientContext ctx) {
        super(ctx);
    }

    private NPCs npcs = new NPCs(ctx);
    private Varps varps = new Varps(ctx);

    @Override
    public boolean activate() {
        return varps.get(281) == 260 || varps.get(281) == 290 || varps.get(281) == 291 || varps.get(281) == 330;
    }

    @Override
    public void execute() {
        npcs.talk(npcs.MINING_INSTRUCTOR);
    }
}
