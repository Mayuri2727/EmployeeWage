package EmpWage;

public class EmpAttendance {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int Emp_Full_Time = 1;
        int Emp_Rate_Hour = 20;
        int empHrs = 0;
        int empWage = 1;
        double empCheck = Math.floor(Math.random() *10)%2;      //RANDOM Method for EMP Present or Absent
        System.out.println("Attendance of emp: " +empCheck);

        if (empCheck == Emp_Full_Time) {                       //Check Presence & Emp Hours
            empHrs = 8;

        } else {
            empHrs = 0;
        }
        empWage = empHrs * Emp_Rate_Hour;                      // Calculate EMP Wage
        System.out.println("Employee Wage : " +empWage);
        }
        }








