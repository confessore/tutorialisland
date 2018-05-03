import engine.Manager;

import org.powerbot.script.PollingScript;
import org.powerbot.script.Script;
import org.powerbot.script.rt4.ClientContext;

@Script.Manifest(name = "Tutorial Island", description = "completes tutorial island")
public class TutorialIsland extends PollingScript<ClientContext> {
    Manager manager = new Manager(ctx);

    @Override
    public void start() {
        manager.Update();
    }

    @Override
    public void poll() {
        manager.Update();
    }
}
