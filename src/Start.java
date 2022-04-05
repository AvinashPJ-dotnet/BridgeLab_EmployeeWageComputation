import Employee.Employee;

public class Start {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.addCompanyEmployeeWage("demart",15,18,105);
        employee.addCompanyEmployeeWage("reliance",18,21,104);
        employee.addCompanyEmployeeWage("bigBazar",15,18,118);
        employee.addCompanyEmployeeWage("mart",21,20,121);
        employee.computeEmployeeWage();
        employee.getWageByCompanyName();
    }

}
