package engine.objects;

import org.powerbot.script.ClientAccessor;
import org.powerbot.script.ClientContext;

public abstract class Context<CTX extends ClientContext> extends ClientAccessor<CTX> {
    public Context(CTX ctx) {
        super(ctx);
    }
}
