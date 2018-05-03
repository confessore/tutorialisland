package engine.modules.zero;

import engine.data.ComponentIds;
import engine.data.statics.ChatOptions;
import engine.objects.Task;
import engine.data.ActivityStati;

import org.powerbot.script.rt4.ChatOption;
import org.powerbot.script.rt4.ClientContext;

public class Chatter extends Task<ClientContext> {
    public Chatter(ClientContext ctx) {
        super(ctx);
    }

    private ActivityStati activityStati = new ActivityStati(ctx);
    private ComponentIds cids = new ComponentIds(ctx);

    @Override
    public boolean activate() {
        return activityStati.inactive() && activityStati.chatting();
    }

    @Override
    public void execute() {
        ChatOptions.UpdateChatOptions(ctx);

        if (ChatOptions.chatOptions.size() == 0) {
            if (ctx.chat.pendingInput())
                cids.errorContinueButton.click();
            if (ctx.chat.canContinue())
                ctx.chat.clickContinue();
        }
        else {
            ctx.chat.continueChat("I am an experienced player.");
            ctx.chat.continueChat("No, I'm not planning to do that.");
            ctx.chat.continueChat("Yes");
        }
    }
}
