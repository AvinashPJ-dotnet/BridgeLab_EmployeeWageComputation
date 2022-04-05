package Employee;

import java.util.ArrayList;

public class Employee implements EmployeeInterface {

    private static final int FULL_TIME = 1;
    private static final int PART_TIME = 2;

    int numOfCompany = 0;
    private final ArrayList<CompanyEmployeeWage> companyEmployeeWagesArray;

    public Employee() {
        companyEmployeeWagesArray = new ArrayList<>();
    }

    @Override
    public void addCompanyEmployeeWage(String companyName, int wagePerHour, int workingDaysPerMonth, int workingHourPreMonth) {
        companyEmployeeWagesArray.add(new CompanyEmployeeWage(companyName, wagePerHour, workingDaysPerMonth, workingHourPreMonth));
        numOfCompany++;
    }

    public void computeEmployeeWage() {
        for (CompanyEmployeeWage obj : companyEmployeeWagesArray) {
            calculateDailyWage(obj);
        }
    }

    public int checkEmployeeIsPresent() {
        return (int) Math.round(Math.random() * 2);
    }

    @Override
    public int calculateDailyWage(CompanyEmployeeWage companyEmployeeWagesArray) {
        int totalWage = 0;//store total wage
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        while (totalWorkingDays < companyEmployeeWagesArray.getWorkingDaysPerMonth() && totalWorkingHours + 4 < companyEmployeeWagesArray.getWorkingHourPerMonth()) {

            int dailyWage = 0;//store only one day wage
            int dailyWorkingHours = 0;//store the daily working hours that is either full-time or part-time
            int isEmployeePresent = checkEmployeeIsPresent();

            switch (isEmployeePresent) //using switch case to calculate wages
            {
                case FULL_TIME:
                    dailyWage = calculateWage(companyEmployeeWagesArray.getFullTimeHours(), companyEmployeeWagesArray.getWagePerHour());
                    dailyWorkingHours = companyEmployeeWagesArray.getFullTimeHours();
                    break;
                case PART_TIME:
                    dailyWage = calculateWage(companyEmployeeWagesArray.getPartTimeHours(), companyEmployeeWagesArray.getWagePerHour());
                    dailyWorkingHours = companyEmployeeWagesArray.getPartTimeHours();
                    break;
                default:
                    break;
            }
            totalWorkingHours += dailyWorkingHours;
            totalWorkingDays++;
            companyEmployeeWagesArray.totalWage += dailyWage;
            companyEmployeeWagesArray.wageEveryDay.add(dailyWage);//store wage in to array on daily basis
        }
        System.out.println("Name: " + companyEmployeeWagesArray.getCompanyName());
        System.out.println("Total Working Days:" + totalWorkingDays + "/" + companyEmployeeWagesArray.getWorkingDaysPerMonth() +
                "\nTotal Working Hours: " + totalWorkingHours + "/" + companyEmployeeWagesArray.getWorkingHourPerMonth() +
                "\nTotal monthly wage: $" + companyEmployeeWagesArray.totalWage);
        System.out.println("list of all day wages: \n" + companyEmployeeWagesArray.wageEveryDay);
        System.out.println();
        return companyEmployeeWagesArray.totalWage;
    }

    //Calculate employee wage
    public int calculateWage(int hours, int wagePerHour) {
        return hours * wagePerHour;
    }
}
