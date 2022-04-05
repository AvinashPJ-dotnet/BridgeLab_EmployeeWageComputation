package Employee;

import java.util.ArrayList;
import java.util.List;

public class CompanyEmployeeWage {
    public int FULL_TIME_HOURS = 8;
    public int PART_TIME_HOURS = 4;

    private final String COMPANY_NAME;
    private final int WAGE_PER_HOUR;
    private final int WORKING_DAY_PER_MONTH;
    private final int WORKING_HOURS_PER_MONTH;
    List<Integer> wageEveryDay=new ArrayList<>();
    int totalWage=0;

    public CompanyEmployeeWage(String companyName, int wage_per_hour, int working_day_per_month, int working_hours_per_month) {
        this.COMPANY_NAME = companyName;
        this.WAGE_PER_HOUR = wage_per_hour;
        this.WORKING_DAY_PER_MONTH = working_day_per_month;
        this.WORKING_HOURS_PER_MONTH = working_hours_per_month;
    }

    public int getFullTimeHours() {
        return FULL_TIME_HOURS;
    }
    public int getPartTimeHours() {
        return PART_TIME_HOURS;
    }

    public String getCompanyName() {
        return COMPANY_NAME;
    }
    public int getWagePerHour() {
        return WAGE_PER_HOUR;
    }
    public int getWorkingDaysPerMonth() {
        return WORKING_DAY_PER_MONTH;
    }
    public int getWorkingHourPerMonth() {
        return WORKING_HOURS_PER_MONTH;
    }
}
