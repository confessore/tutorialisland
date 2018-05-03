package engine.modules.nine;

import engine.objects.Task;
import engine.data.ComponentIds;
import engine.data.statics.VarpbitsArray;

import org.powerbot.script.rt4.ClientContext;

public class FriendsMenu extends Task<ClientContext> {
    public FriendsMenu(ClientContext ctx) {
        super(ctx);
    }

    private ComponentIds cids = new ComponentIds(ctx);

    @Override
    public boolean activate() {
        return VarpbitsArray.varpbitsArray[281] == 580
                && VarpbitsArray.varpbitsArray[1021] == 9;
    }

    @Override
    public void execute() {
        cids.friendsButton.click();
    }
}
