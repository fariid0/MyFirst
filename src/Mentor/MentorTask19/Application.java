package src.Mentor.MentorTask19;

public class Application {
    String name;
    double version;

    public Application(String name, double version) {
        this.name = name;
        this.version = version;
    }

    public void applicationUpdater (String name, double version) {

    }

    @Override
    public String toString() {
        return name + version;
    }
}
