package engine.modules.four;

import engine.objects.Task;
import engine.data.ComponentIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class QuestListMenu extends Task<ClientContext> {
    public QuestListMenu(ClientContext ctx) {
        super(ctx);
    }

    private ComponentIds cids = new ComponentIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 230
                && VarpbitsArray.varpbitsArray[1021] == 3;
    }

    @Override
    public void execute() {
        cids.questListButton.click();
    }
}
