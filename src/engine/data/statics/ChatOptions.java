package engine.data.statics;

import org.powerbot.script.rt4.ChatOption;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.Component;
import org.powerbot.script.rt4.Constants;

import java.util.List;
import java.util.ArrayList;

public class ChatOptions {
    public static List<ChatOption> chatOptions = new ArrayList<ChatOption>();

    public static void UpdateChatOptions(ClientContext ctx) {
        chatOptions.clear();
        chatOptions.addAll(get(ctx));
    }

    private static List<ChatOption> get(ClientContext ctx) {
        final List<ChatOption> options = new ArrayList<ChatOption>(5);
        final Component parent = ctx.widgets.component(Constants.CHAT_WIDGET, 0);

        for (int i = 0; i < 5; i++) {
            final Component component = parent.component(Constants.CHAT_OPTIONS[i]);

            if (!component.valid() || component.textureId() != -1) {
                continue;
            }

            options.add(new ChatOption(ctx, i, component));
        }

        return options;
    }
}
