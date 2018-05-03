package engine.modules.six;

import engine.objects.Task;
import engine.data.ComponentIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class CombatOptionsMenu extends Task<ClientContext> {
    public CombatOptionsMenu(ClientContext ctx) {
        super(ctx);
    }

    private ComponentIds cids = new ComponentIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 430
                && VarpbitsArray.varpbitsArray[1021] == 1;
    }

    @Override
    public void execute() {
        cids.combatOptionsButton.click();
    }
}
