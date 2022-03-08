package Employee;

public class EmployeeAttendance
{
    public void checkEmployeeIsPresent(){
        int isPresent=(int)Math.round( Math.random() * 1);
        if (isPresent == 1){
            System.out.println("Employee is Present");
        }
        else{
            System.out.println("Employee is Absent");
        }
    }

}
