package src.Dersde.MentorMath;

public class AdvancedMathOperations extends MathOperations{

    @Override
    public int vurma(int num1, int num2) {
        boolean flag = true;
        if (flag){
            return super.vurma(num1, num2);
        } else return (int) Math.pow(num1,num2);
    }
}
