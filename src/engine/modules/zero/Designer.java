package engine.modules.zero;

import engine.objects.Task;
import engine.data.DesignerOptions;

import org.powerbot.script.Condition;
import org.powerbot.script.Random;
import org.powerbot.script.rt4.ClientContext;

public class Designer extends Task<ClientContext> {
    public Designer(ClientContext ctx) {
        super(ctx);
    }

    private DesignerOptions designerOptions = new DesignerOptions(ctx);

    @Override
    public boolean activate() {
        return designerOptions.designerWindow.visible();
    }

    @Override
    public void execute() {
        for (int x = 0; x < ClickRandom(); x++) {
            designerOptions.designerArms.click();
            WaitRandom();
        }

        for (int x = 0; x < ClickRandom(); x++) {
            designerOptions.designerFeet.click();
            WaitRandom();
        }

        for (int x = 0; x < ClickRandom(); x++) {
            designerOptions.designerFeet2.click();
            WaitRandom();
        }

        for (int x = 0; x < ClickRandom(); x++) {
            designerOptions.designerHair.click();
            WaitRandom();
        }

        for (int x = 0; x < ClickRandom(); x++) {
            designerOptions.designerHands.click();
            WaitRandom();
        }

        for (int x = 0; x < ClickRandom(); x++) {
            designerOptions.designerHead.click();
            WaitRandom();
        }

        for (int x = 0; x < ClickRandom(); x++) {
            designerOptions.designerJaw.click();
            WaitRandom();
        }

        for (int x = 0; x < ClickRandom(); x++) {
            designerOptions.designerLegs.click();
            WaitRandom();
        }

        for (int x = 0; x < ClickRandom(); x++) {
            designerOptions.designerLegs2.click();
            WaitRandom();
        }

        for (int x = 0; x < ClickRandom(); x++) {
            designerOptions.designerSkin.click();
            WaitRandom();
        }

        for (int x = 0; x < ClickRandom(); x++) {
            designerOptions.designerTorso.click();
            WaitRandom();
        }

        for (int x = 0; x < ClickRandom(); x++) {
            designerOptions.designerTorso2.click();
            WaitRandom();
        }

        designerOptions.designerAccept.click();
    }

    private int ClickRandom() {
        return Random.nextInt(0, 10);
    }

    private void WaitRandom() {
        Condition.sleep(Random.nextInt(512, 1024));
    }
}
