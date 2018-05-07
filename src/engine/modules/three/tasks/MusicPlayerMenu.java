package engine.modules.three.tasks;

import engine.constants.Components;
import engine.constants.Varps;
import engine.objects.Task;

import org.powerbot.script.rt4.ClientContext;

public class MusicPlayerMenu extends Task<ClientContext> {
    public MusicPlayerMenu(ClientContext ctx) {
        super(ctx);
    }

    private Components components = new Components(ctx);
    private Varps varps = new Varps(ctx);

    @Override
    public boolean activate() {
        return varps.get(281) == 170 && varps.get(1021) == 14;
    }

    @Override
    public void execute() {
        components.MUSICPLAYER_BUTTON.click();
    }
}
