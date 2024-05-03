package src.Mentor.MentorTask11;

public class Main {
    public static void main(String[] args) {

        Worker worker1 = new Worker("Inal", "11.11.2000",2027);
        System.out.println(worker1);
        worker1.retire();
        System.out.println("");

        SalariedEmployee worker2 = new SalariedEmployee("Ferid","23.11.2002",2060,12345,"10.09.2024", 35.995);
        System.out.println(worker2);
        worker2.getMonthlySalary();
    }
}
