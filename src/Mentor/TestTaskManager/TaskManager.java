package src.Mentor.TestTaskManager;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    List<Task> tasks = new ArrayList<>();

    public void addTask (Task task) throws DuplicateTaskException{
        for (Task t : tasks){
            if (t.getText().equals(task.getText())){
                throw new DuplicateTaskException("Movcuddur");
            }
        }
        tasks.add(task);
    }

    private void removeTask (String text){
        for (Task t : tasks){
            if (t.getText().equals(text)){
                tasks.remove(t);
            }
        }
    }

}
