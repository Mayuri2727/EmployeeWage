package EmpWage;

public class EmpAttendance {
    public static final int Emp_Part_Time = 1;
    public static final int Emp_Full_Time = 2;
    public static final int Emp_Rate_Hour = 20;
    public static void main(String[] args) {
       // System.out.println("Welcome to Employee Wage Computation Program");
        int empHrs = 0;
        int empWage = 0;
        int empCheck = (int)  Math.floor(Math.random() *10)%2;
        //System.out.println("Attendance of emp: " +empCheck);

        switch (empCheck) {
            case Emp_Part_Time:
                empHrs = 4;
                break;
            case Emp_Full_Time:
                empHrs = 8;
                break;
            default:
                empHrs = 0;
        }

        empWage = empHrs * Emp_Rate_Hour;                      // Calculate EMP Wage
        System.out.println("Employee Wage : " +empWage);
    }
}








