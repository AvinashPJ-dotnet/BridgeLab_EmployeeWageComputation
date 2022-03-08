package Employee;

public class Employee
{
    private static final int PRESENT = 1;
//    int PRESENT=1;
    private static final int PARTTIME = 2;
    int WAGE_PRE_HOUR=20;
    int FULL_DAY_HOUR=8;
    int PART_DAY_HOUR=4;
    int WORKING_DAY_PER_MONTH=20;

    public int checkEmployeeIsPresent(){
        int isPresent=(int)Math.round( Math.random() * 2);
        /*if (isPresent == PRESENT){
            System.out.println("Employee is Present");
        }
        else if(isPresent== PARTTIME){
            System.out.println("Employee is Part time Present");
        }
        else{
            System.out.println("Employee is Absent");
        }*/
        return isPresent;
    }

    public void calculateDailyWage(){
        int dailyWage = 0;
        int total_working_days =1;
        while (total_working_days < WORKING_DAY_PER_MONTH){
            int isEmployeePresent=checkEmployeeIsPresent();
//        using switch case to calculate wages
            switch (isEmployeePresent) {
                case PRESENT:
                    dailyWage+= FULL_DAY_HOUR * WAGE_PRE_HOUR;
//                    System.out.println("Full day total wage is $"+dailyWage);
                    break;
                case PARTTIME:
                    dailyWage+= PART_DAY_HOUR * WAGE_PRE_HOUR;
//                    System.out.println("Part time day total wage is $"+dailyWage);
                    break;
                default:
                    dailyWage+=0;
//                    System.out.println("Absent day total wage is $"+dailyWage);
                    break;
            }
            total_working_days++;
        }
        System.out.println("For "+total_working_days+" days Total monthly wage is: $"+dailyWage);
    }

}
