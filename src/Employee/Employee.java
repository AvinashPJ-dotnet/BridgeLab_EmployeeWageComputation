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
    int WORKING_HOURS_PER_MONTH=100;

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
        int totalWorkingDays =0;
        int totalWorkingHours=0;

        while (totalWorkingDays < WORKING_DAY_PER_MONTH && totalWorkingHours+4 < WORKING_HOURS_PER_MONTH){
            int isEmployeePresent=checkEmployeeIsPresent();
//        using switch case to calculate wages
            switch (isEmployeePresent) {
                case PRESENT:
                    dailyWage+= FULL_DAY_HOUR * WAGE_PRE_HOUR;
                    totalWorkingHours+=FULL_DAY_HOUR;
//                    System.out.println("Full day total wage is $"+dailyWage);
                    break;
                case PARTTIME:
                    dailyWage+= PART_DAY_HOUR * WAGE_PRE_HOUR;
                    totalWorkingHours+=PART_DAY_HOUR;
//                    System.out.println("Part time day total wage is $"+dailyWage);
                    break;
                default:
                    dailyWage+=0;
                    totalWorkingHours+=0;
//                    System.out.println("Absent day total wage is $"+dailyWage);
                    break;
            }
            totalWorkingDays++;
        }
        System.out.println("Total Working Days:"+totalWorkingDays+"/"+WORKING_DAY_PER_MONTH+
                "\nTotal Working Hours "+totalWorkingHours+"/"+WORKING_HOURS_PER_MONTH+
                "\nTotal monthly wage $"+dailyWage);
    }

}
