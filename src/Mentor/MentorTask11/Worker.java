package src.Mentor.MentorTask11;

public class Worker {
    String name;
    String birthDate;
    int endOfContractYear;

    public String retire() {
        if (endOfContractYear <= 2024) {
            return "Pensiyaya cixdi";
        }
            return "Pensiya muddetine catmayib";
    }

    public Worker(String name, String birthDate, int endOfContractYear) {
        this.name = name;
        this.birthDate = birthDate;
        this.endOfContractYear = endOfContractYear;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endOfContractYear=" + endOfContractYear + "\n" + retire();
    }
}
