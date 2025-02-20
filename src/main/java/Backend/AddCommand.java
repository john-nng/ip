package Backend;
import tasks.Task;

import java.io.IOException;
import java.util.List;

/**
 * This class represents a Add command that is used to add tasks to your todolist.
 * Derived from the Command Super Class.
 */
public class AddCommand extends Command{

    private Task task;

    public AddCommand(Task t) {
        this.task = t;
    }
    /**
     * Performs the action of adding a task to the existing List of Task Objects.
     *
     * @param tasks Given a List of Task Objects.
     */
    @Override
    public void execute(List<Task> tasks) {
        task.addTo(tasks);

        try {
            DataManager.saveData(tasks);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
