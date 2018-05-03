package engine.handlers;

import engine.objects.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskHandler {
    public List<Task> taskList = new ArrayList<Task>();

    public void ExecuteTasks() {
        for (Task task : taskList) {
            if (task.activate()) {
                task.execute();
                System.out.println(task);
            }
        }
    }
}
