package src.Lesson.Task12.Final;

public class MathUtils {
    int a;
    int b;

    public final int calculate(){
        return a + b;
    }

    public MathUtils(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "MathUtils" +
                " a = " + a +
                ", b = " + b +
                " Cem = " + calculate();
    }
}
