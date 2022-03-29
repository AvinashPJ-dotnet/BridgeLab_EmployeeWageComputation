import Employee.Employee;

public class Start {
    public static void main(String[] args) {
        Employee obj1 = new Employee("rajesh");
        obj1.calculateDailyWage();

        Employee demartEmployee = new Employee("demart");
        demartEmployee.WORKING_HOURS_PER_MONTH = 110;
        demartEmployee.WORKING_DAY_PER_MONTH=22;
        demartEmployee.FULL_TIME_HOURS=10;
        demartEmployee.PART_TIME_HOURS=5;
        demartEmployee.WAGE_PER_HOUR=50;
        demartEmployee.calculateDailyWage();

        Employee relianceEmployee = new Employee("Reliance");
        relianceEmployee.WORKING_HOURS_PER_MONTH = 105;
        relianceEmployee.WORKING_DAY_PER_MONTH=18;
        relianceEmployee.FULL_TIME_HOURS=7;
        relianceEmployee.PART_TIME_HOURS=3;
        relianceEmployee.WAGE_PER_HOUR=35;
        relianceEmployee.calculateDailyWage();

    }

}
