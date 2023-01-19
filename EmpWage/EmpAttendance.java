package EmpWage;

public class EmpAttendance {
    public static final int Emp_Part_Time = 1;
    public static final int Emp_Full_Time = 2;
    public static final int Emp_Rate_Hour = 20;
    public static final int Emp_Work_Day = 2;
    public static final int Max_Hrs_In_Month = 10;
    public static void main(String[] args) {
        // System.out.println("Welcome to Employee Wage Computation Program");
        int empHrs = 0;
        //int empWage = 0;
        int totalEmpDays = 0;
        int totalEmpHrs = 0;
        while (totalEmpHrs <= Max_Hrs_In_Month && totalEmpDays < Emp_Work_Day ) {
            totalEmpDays++;
            int empCheck = (int) Math.floor(Math.random() + 10) % 3;
            switch (empCheck) {                         //Switch Case
                case Emp_Part_Time:
                    empHrs = 4;
                    break;
                case Emp_Full_Time:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }

            totalEmpHrs += empHrs;
            System.out.println("Day#: " + totalEmpDays + ",  Emp hr: " + empHrs);
        }
        int totalEmpWage = totalEmpHrs * Emp_Rate_Hour;
        System.out.println("Total Emp Wage: " +totalEmpWage );
    }
}







