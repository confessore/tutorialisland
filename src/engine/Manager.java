package engine;

import engine.data.*;
import engine.data.statics.VarpbitsArray;
import engine.handlers.TaskHandler;
import engine.modules.eight.*;
import engine.modules.five.*;
import engine.modules.four.*;
import engine.modules.nine.*;
import engine.modules.one.*;
import engine.modules.seven.*;
import engine.modules.six.*;
import engine.modules.ten.*;
import engine.modules.three.*;
import engine.modules.two.*;
import engine.modules.zero.*;
import engine.objects.Context;
import engine.objects.Task;
import utilities.VarpbitSpy;

import org.powerbot.script.Condition;
import org.powerbot.script.Random;
import org.powerbot.script.rt4.ClientContext;

import java.util.Arrays;
import java.util.List;

public class Manager extends Context<ClientContext> {
    public Manager(ClientContext ctx) {
        super(ctx);
    }

    private TaskHandler taskHandler = new TaskHandler();
    private ActivityStati activityStati = new ActivityStati(ctx);
    private VarpbitSpy vbs = new VarpbitSpy(ctx);

    public void Update() {
        taskHandler.taskList.clear();
        VarpbitsArray.UpdateVarpbits(ctx);
        vbs.PollChanges();
        UpdateTaskList();
        taskHandler.ExecuteTasks();
        Condition.sleep(Random.nextInt(1024, 2048));
    }

    private void UpdateTaskList() {
        if (VarpbitsArray.varpbitsArray[22] == 0)
            taskHandler.taskList.addAll(Arrays.asList(new Designer(ctx)));
        else if (VarpbitsArray.varpbitsArray[281] > 3 && VarpbitsArray.varpbitsArray[168] < 4)
            taskHandler.taskList.addAll(Arrays.asList(new Audio(ctx)));
        else if (VarpbitsArray.varpbitsArray[281] > 3 && VarpbitsArray.varpbitsArray[173] == 0
                && ctx.movement.energyLevel() > 49)
            taskHandler.taskList.addAll(Arrays.asList(new Run(ctx)));
        else if (activityStati.chatting())
            taskHandler.taskList.addAll(Arrays.asList(new Chatter(ctx)));
        else {
            if (VarpbitsArray.varpbitsArray[281] >= -1 && VarpbitsArray.varpbitsArray[281] < 20)
                UpdateTaskList(Arrays.asList(new RSGuide1(ctx), new OptionsMenu1(ctx), new RSGuide2(ctx),
                    new Door1(ctx)));
            if (VarpbitsArray.varpbitsArray[281] >= 20 && VarpbitsArray.varpbitsArray[281] < 130)
                UpdateTaskList(Arrays.asList(new SurvivalExpert1(ctx), new BackpackMenu(ctx), new Tree(ctx),
                        new Fire(ctx), new StatsMenu(ctx), new SurvivalExpert2(ctx), new Fish(ctx),
                        new CookShrimp(ctx), new Gate1(ctx)));
            if (VarpbitsArray.varpbitsArray[281] >= 130 && VarpbitsArray.varpbitsArray[281] < 183)
                UpdateTaskList(Arrays.asList(new Door2(ctx), new MasterChef(ctx), new Dough(ctx), new Bake(ctx),
                        new MusicPlayerMenu(ctx), new Door3(ctx)));
            if (VarpbitsArray.varpbitsArray[281] >= 183 && VarpbitsArray.varpbitsArray[281] < 260)
                UpdateTaskList(Arrays.asList(new EmoteMenu(ctx), new Emote(ctx), new OptionsMenu2(ctx), new Door4(ctx),
                        new QuestGuide1(ctx), new QuestListMenu(ctx), new QuestGuide2(ctx), new Ladder1(ctx)));
            if (VarpbitsArray.varpbitsArray[281] >= 160 && VarpbitsArray.varpbitsArray[281] < 370)
                UpdateTaskList(Arrays.asList(new MiningInstructor1(ctx), new Prospect(ctx),
                        new MiningInstructor2(ctx), new Mine(ctx), new Smelt(ctx), new MiningInstructor3(ctx),
                        new Smith(ctx), new Gate2(ctx)));
            if (VarpbitsArray.varpbitsArray[281] >= 370 && VarpbitsArray.varpbitsArray[281] < 440)
                UpdateTaskList(Arrays.asList(new CombatInstructor1(ctx), new WornEquipmentMenu(ctx),
                        new ViewEquipmentStats(ctx), new EquipDagger(ctx), new CombatInstructor2(ctx),
                        new EquipMelee(ctx), new CombatOptionsMenu(ctx)));
            if (VarpbitsArray.varpbitsArray[281] >= 440 && VarpbitsArray.varpbitsArray[281] < 510)
                UpdateTaskList(Arrays.asList(new Gate3(ctx), new RatMelee(ctx), new RatRange(ctx),
                        new Ladder2(ctx)));
            if (VarpbitsArray.varpbitsArray[281] >= 510 && VarpbitsArray.varpbitsArray[281] < 550)
                UpdateTaskList(Arrays.asList(new Bank(ctx), new Poll(ctx), new Door5(ctx), new FinancialAdvisor(ctx),
                        new Door6(ctx)));
            if (VarpbitsArray.varpbitsArray[281] >= 550 && VarpbitsArray.varpbitsArray[281] < 620)
                UpdateTaskList(Arrays.asList(new BrotherBrace1(ctx), new PrayerMenu(ctx), new BrotherBrace2(ctx),
                        new FriendsMenu(ctx), new IgnoredMenu(ctx), new BrotherBrace3(ctx), new Door7(ctx)));
            if (VarpbitsArray.varpbitsArray[281] >= 620 && VarpbitsArray.varpbitsArray[281] < 1000)
                UpdateTaskList(Arrays.asList(new MagicInstructor1(ctx), new MagicMenu(ctx), new WindStrike(ctx),
                        new MagicInstructor2(ctx)));
            if (VarpbitsArray.varpbitsArray[281] == 1000) {
                System.out.println("tutorialisland complete. stopping.");
                ctx.controller.stop();
            }
        }
    }

    private void UpdateTaskList(List<Task> tasks) {
        taskHandler.taskList.addAll(tasks);
    }
}
