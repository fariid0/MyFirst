package src.Lesson.Task13.CompileTime;

public class ShapeCalculator {

    public double calculateArea(double a){
        return Math.pow(a,2);
    }

    public int calculateArea(int a, int h){
        return ( a * h ) / 2;
    }

    public int calculateArea(int r){ return  ((int) (Math.PI * Math.pow(r,2))); }

}
