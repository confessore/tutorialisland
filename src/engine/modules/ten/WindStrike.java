package engine.modules.ten;

import engine.data.NpcIds;
import engine.objects.Task;
import engine.data.ComponentIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class WindStrike extends Task<ClientContext> {
    public WindStrike(ClientContext ctx) {
        super(ctx);
    }

    private ComponentIds cids = new ComponentIds(ctx);
    private NpcIds npcids = new NpcIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 650;
    }

    @Override
    public void execute() {
        if (cids.magicWindow.visible()) {
            cids.spellWindStrike.click();
            npcids.nearestChicken.interact("Cast");
        }
        else
            cids.magicButton.click();
    }
}
