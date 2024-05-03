package src.Lesson.Task11;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Farid", 21, "0558030202");
        Person person2 = new Person("Ehmed", 20,"0558030202");

        System.out.println(person1.equals(person2));

        System.out.println(person1.name.hashCode());

    }

    private String moto;
    int year;
}
