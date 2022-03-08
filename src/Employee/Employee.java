package Employee;

public class Employee
{
    int PRESENT=1;
    int WAGE_PRE_HOUR=20;
    int FULL_DAY_HOUR=8;

    public int checkEmployeeIsPresent(){
        int isPresent=(int)Math.round( Math.random() * 1);
        if (isPresent == PRESENT){
            System.out.println("Employee is Present");
        }
        else{
            System.out.println("Employee is Absent");
        }
        return isPresent;
    }

    public void calculateDailyWage(){
        int dailyWage;
        int isEmployeePresent=checkEmployeeIsPresent();
        if ( isEmployeePresent == PRESENT){
            dailyWage= FULL_DAY_HOUR * WAGE_PRE_HOUR;
            System.out.println("Full day total wage is $"+dailyWage);
        }
        else {
            dailyWage=0;
            System.out.println("Full day total wage is $"+dailyWage);
        }
//        return dailyWage;
    }



}
