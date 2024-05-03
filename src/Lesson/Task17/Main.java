package src.Lesson.Task17;

public class Main {
    public static void main(String[] args) {

        //TASK 1 STRING

        String example1 = "Salam Ferid";
        String example2 = "Salam Inal";
        String example3 ="Salam Kenan";


        System.out.println(example2.concat(", " + example3));
        System.out.println(example3.substring(6));
        System.out.println(example2.length());


        //TASK 2 STRING BUILDER

        StringBuilder num = new StringBuilder("0558030202");
        StringBuilder name = new StringBuilder(" Farid's num");
        StringBuilder year = new StringBuilder("2002");

        name.append(" " + num);
        name.insert(0, year);

        System.out.println(name);


        //TASK 3 STRING BUFFER

        StringBuffer person = new StringBuffer("Admin");
        //??

        System.out.println(person);
    }
}
