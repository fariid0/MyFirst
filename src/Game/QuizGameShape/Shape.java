package src.Game.QuizGameShape;

public class Shape {

    static int r = (int) (Math.random()*15);
    static int terefA = (int) (Math.random()*15);
    static int terefB = (int) (Math.random()*15);
    static int a = (int) (Math.random()*15);
    static int b = (int) (Math.random()*15);

    public static int Circle(){
        return (int) (Math.PI * Math.pow(r,2));
    }

    public static int Rectangle(){
        return terefA * terefB;
    }

    public static int Triangle(){
        return (int) (0.5 * a * b);
    }

}
