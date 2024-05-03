package src.Mentor.TestTaskManager;

public class Task {
    private String text;
    private PriorityLevel priority;
    private double s;

    public Task(String text, double s) {
        this.text = text;
        this.s = s;

        if (s <= 4){
            priority = PriorityLevel.LOW;
        } if (s > 4 && s <= 8){
            priority = PriorityLevel.MEDIUM;
        } if (s > 8){
            priority= PriorityLevel.HIGH;
        }
    }

    @Override
    public String toString() {
        return "Task: " + text +
                ", saatiniz: " + s;
    }

    public String getText() {
        return text;
    }

    public PriorityLevel getPriority() {
        return priority;
    }

    public double getS() {
        return s;
    }
}
