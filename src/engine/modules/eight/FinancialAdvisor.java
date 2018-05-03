package engine.modules.eight;

import engine.objects.Task;
import engine.data.NpcIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class FinancialAdvisor extends Task<ClientContext> {
    public FinancialAdvisor(ClientContext ctx) {
        super(ctx);
    }

    private NpcIds npcids = new NpcIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 530;
    }

    @Override
    public void execute() {
        if (npcids.nearestFinancialAdvisor.inViewport()) {
            ctx.camera.turnTo(npcids.nearestFinancialAdvisor);
            npcids.nearestFinancialAdvisor.interact("Talk-to");
        } else {
            ctx.camera.turnTo(npcids.nearestFinancialAdvisor);
            ctx.movement.step(npcids.nearestFinancialAdvisor);
        }
    }
}
