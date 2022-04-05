package Employee;

public interface EmployeeInterface {
    void addCompanyEmployeeWage(String companyName, int wagePerHour, int workingDaysPerMonth, int workingHourPreMonth);
    int calculateDailyWage(CompanyEmployeeWage companyEmployeeWagesArray);
}
