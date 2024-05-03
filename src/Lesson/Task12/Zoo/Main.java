package src.Lesson.Task12.Zoo;

public class Main {
    public static void main(String[] args) {

        Bird qus1 = new Bird("Tavuk", 1,"civ-civ",2.1);

        Mammal mammal1 = new Mammal("Ayi", 2, "WWAA", "Brown");

        Aquatic baliq1 = new Aquatic("Delfin", 4, "bulbul",5.5);

        Animals[] zoo = new Animals[] {qus1, mammal1, baliq1};

        for (Animals animal : zoo){
            System.out.println(animal);
        }

    }
}
