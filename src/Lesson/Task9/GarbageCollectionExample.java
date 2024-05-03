package src.Lesson.Task9;

public class GarbageCollectionExample {
    public static void main(String[] args) {


        // SPACE COMPLEXITY
        // TIME COMPLEXITY

        String student1 = "salam";
        String student3 = null;
        String student2 = "Ferid";

        System.gc();

        System.out.println(student1);

        MemoryDemo salam = new MemoryDemo("Hello world", 7);


    }
}
