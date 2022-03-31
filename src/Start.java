import Employee.Employee;

public class Start {
    public static void main(String[] args) {
        Employee demartEmployee = new Employee("demart", 15, 18, 105);
        demartEmployee.calculateDailyWage();

        Employee relianceEmployee = new Employee("Reliance", 18, 21, 104);
        relianceEmployee.calculateDailyWage();

    }

}
