import Employee.Employee;

public class Start {
    public static void main(String[] args) {
        Employee demartEmployee = new Employee("demart", 15, 18, 105);
        int totalDemartWage=demartEmployee.calculateDailyWage();

        Employee relianceEmployee = new Employee("Reliance", 18, 21, 104);
        int totalRelianceWage=relianceEmployee.calculateDailyWage();

        System.out.println("total Demart wage: "+totalDemartWage);
        System.out.println("total Reliance wage: "+totalRelianceWage);
    }

}
