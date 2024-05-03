package src.Mentor.MentorTask11;

public class Employee extends Worker{
    long employeeId;
    String hireDate;

    public Employee(String name, String birthDate, int endOfContractYear, long employeeId, String hireDate) {
        super(name, birthDate, endOfContractYear);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee: " +
                "EmployeeId: " + employeeId +
                ", HireDate: " + hireDate +
                ", Name: " + name +
                ", BirthDate: " + birthDate +
                ", endOfContractYear: " + endOfContractYear;
    }
}
