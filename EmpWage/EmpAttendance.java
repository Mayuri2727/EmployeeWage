package EmpWage;

public class EmpAttendance {
    public static final int Emp_Part_Time = 1;
    public static final int Emp_Full_Time = 2;
    public static final int Emp_Rate_Hour = 20;
    public static final int Emp_Work_Day = 2;

    public static void main(String[] args) {
        // System.out.println("Welcome to Employee Wage Computation Program");
        int empHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;
        for (int day = 0; day < Emp_Work_Day; day++) {
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

            empWage = empHrs * Emp_Rate_Hour;
            totalEmpWage += empWage;
            System.out.println("Employee Wage : " + empWage);
        }
        System.out.println("Total Employee Wage : " +totalEmpWage);
    }
}







