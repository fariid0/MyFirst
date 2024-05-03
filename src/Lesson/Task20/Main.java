package src.Lesson.Task20;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> salam = new HashMap<>();
        salam.put("Ferid", "Java3");
        salam.put("Kenan", "Java3");
        salam.put("Inal", "Java3");
        salam.put("Elvin", "Java3");

        System.out.println("Inalin grupu: " + salam.get("Ferid") + "\n");


        for (Map.Entry<String,String> entry : salam.entrySet()){
            System.out.println("Qrup: " + entry.getKey() + ", Telebe: " + entry.getValue());
        }

        salam.remove("Inal");
        System.out.println();

        for (Map.Entry<String,String> entry : salam.entrySet()){
            System.out.println("Qrup: " + entry.getKey() + ", Telebe: " + entry.getValue());
        }

    }
}
