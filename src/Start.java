import Employee.Employee;

public class Start {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.addCompanyEmployeeWage("demart",15,18,105);
        employee.addCompanyEmployeeWage("reliance",18,21,104);
        employee.computeEmployeeWage();

    }

}
