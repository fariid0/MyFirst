package src.Mentor.MentorTask11;

public class SalariedEmployee extends Employee{
    double annualSalary;
    public void getMonthlySalary(){
        System.out.println("Monthly Salary: "+ annualSalary/12);
    }

    public SalariedEmployee(String name, String birthDate, int endOfContractYear, long employeeId, String hireDate, double annualSalary) {
        super(name, birthDate, endOfContractYear, employeeId, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee: " +
                "Name: " + name +
                " BirthDate: " + birthDate +
                " endOfContractYear: " + endOfContractYear + "\n" +
                "AnnualSalary: " + annualSalary +
                " EmployeeId: " + employeeId +
                " HireDate: " + hireDate;



    }
}
