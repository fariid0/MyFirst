package src.Mentor.MentorTask11;

public class HourlyEmployee extends Employee{
    double hourlySalary;

    public void getWeeklySalary(){
        System.out.println("Weekly Salary: " + hourlySalary * 40 + "\n" + "*Assuming 40 hours per week");
    }

    public HourlyEmployee(String name, String birthDate, int endOfContractYear, long employeeId, String hireDate, double hourlySalary) {
        super(name, birthDate, endOfContractYear, employeeId, hireDate);
        this.hourlySalary = hourlySalary;
    }

    @Override
    public String toString() {
        return "HourlyEmployee  " +
                "Name: " + name +
                ", BirthDate: " + birthDate +
                ", EndOfContractYear: " + endOfContractYear + "\n" +
                "EmployeeId: " + employeeId +
                ", HireDate: " + hireDate +
                "HourlySalary: " + hourlySalary;




    }
}
