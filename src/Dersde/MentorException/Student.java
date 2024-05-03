package src.Dersde.MentorException;

public class Student {
    String student1;
    double score1;
    String student2;
    double score2;
    String student3;
    double score3;

    public Student(String student1, double score1, String student2, double score2, String student3, double score3) {
        this.student1 = student1;
        this.score1 = score1;
        this.student2 = student2;
        this.score2 = score2;
        this.student3 = student3;
        this.score3 = score3;
    }

    double scoreAverage(){
        return (score1 + score2 + score3) /3;
    }

    @Override
    public String toString() {
        return
                "Student1: " + student1 +
                ", Score1: " + score1 + "\n"+
                "Student: " + student2 +
                ", Score2: " + score2 + "\n"+
                "Student3: " + student3 +
                ", Score3: " + score3 + "\n" +
                "ScoreAverage: " + scoreAverage();
    }
}
