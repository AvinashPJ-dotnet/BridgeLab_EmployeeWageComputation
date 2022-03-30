package Employee;

import java.util.Arrays;

public class Employee {

    private static final int FULL_TIME = 1;
    private static final int PART_TIME = 2;
    public int FULL_TIME_HOURS = 8;
    public int PART_TIME_HOURS = 4;

    //constant variables are initialized in constructor
    private final String companyName;
    private final int WAGE_PER_HOUR;
    private final int WORKING_DAY_PER_MONTH;
    private final int WORKING_HOURS_PER_MONTH;

    public Employee(String companyName, int wagePerHour, int workingDaysPerMonth, int workingHourPreMonth) {
        this.companyName = companyName;
        this.WAGE_PER_HOUR = wagePerHour;
        this.WORKING_DAY_PER_MONTH = workingDaysPerMonth;
        this.WORKING_HOURS_PER_MONTH = workingHourPreMonth;
    }

    public int checkEmployeeIsPresent() {
        return (int) Math.round(Math.random() * 2);
    }

    public void calculateDailyWage() {
        int totalWage = 0;//store total wage
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int[] wageEveryDay = new int[WORKING_DAY_PER_MONTH];
        while (totalWorkingDays < WORKING_DAY_PER_MONTH && totalWorkingHours + 4 < WORKING_HOURS_PER_MONTH) {
            int dailyWage = 0;//store only one day wage
            int dailyWorkingHours = 0;//store the daily working hours that is either full-time or part-time
            int isEmployeePresent = checkEmployeeIsPresent();
//        using switch case to calculate wages
            switch (isEmployeePresent) {
                case FULL_TIME:
                    dailyWage = calculateWage(FULL_TIME_HOURS, WAGE_PER_HOUR);
                    dailyWorkingHours = FULL_TIME_HOURS;
                    break;
                case PART_TIME:
                    dailyWage = calculateWage(PART_TIME_HOURS, WAGE_PER_HOUR);
                    dailyWorkingHours = PART_TIME_HOURS;
                    break;
                default:
                    break;
            }
            totalWorkingHours += dailyWorkingHours;
            totalWage += dailyWage;
            wageEveryDay[totalWorkingDays] = dailyWage;//store wage in to array on daily basis
            totalWorkingDays++;
        }
        System.out.println("Name: " + companyName);
        System.out.println("Total Working Days:" + totalWorkingDays + "/" + WORKING_DAY_PER_MONTH +
                "\nTotal Working Hours: " + totalWorkingHours + "/" + WORKING_HOURS_PER_MONTH +
                "\nTotal monthly wage: $" + totalWage);
        System.out.println("list of all day wages: \n" + Arrays.toString(wageEveryDay));
        System.out.println();
    }

    //Calculate employee wage
    public int calculateWage(int hours, int wagePerHour) {
        return hours * wagePerHour;
    }
}
