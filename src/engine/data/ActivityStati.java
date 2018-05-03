package engine.data;

import engine.objects.Context;

import org.powerbot.script.rt4.ClientContext;

public class ActivityStati extends Context<ClientContext> {
    public ActivityStati(ClientContext ctx) {
        super(ctx);
    }

    public boolean chatting() {
        return ctx.chat.chatting() || ctx.chat.pendingInput();
    }

    public boolean inactive() {
        return ctx.players.local().animation() == -1
                && !ctx.players.local().inMotion();
    }
}
