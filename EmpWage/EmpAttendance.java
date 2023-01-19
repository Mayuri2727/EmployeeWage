package EmpWage;

public class EmpAttendance {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int Emp_Full_Time = 1;
        double Attendance = Math.floor(Math.random() *10)%2;
        System.out.println("Attendance of emp: " +Attendance);
        if (Attendance == Emp_Full_Time) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
        }
    }


