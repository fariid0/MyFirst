package src.Mentor.MentorTask19;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Application application1 = new Application("Minecraft", 17.3);
        Application application2 = new Application("Notion", 5.5);
        Application application3 = new Application("Telegram", 3.1);

        List<Application> app = new ArrayList<>();
        app.add(application1);
        app.add(application2);
        app.add(application3);

        System.out.println(app);
    }
}
