package EmpWage;

public class EmpAttendance {
    private static int WAGE_PER_HOUR;
    private static int NUM_WORKING_DAYS;
    private static int MAX_HOURS_IN_MONTH;
    private static int totalEmpWage;

    public static void setWagePerHour(int wagePerHour) {
        WAGE_PER_HOUR = wagePerHour;
    }

    public static void setNumWorkingDays(int numWorkingDays) {
        NUM_WORKING_DAYS = numWorkingDays;
    }

    public static void setMaxHoursInMonth(int maxHoursInMonth) {
        MAX_HOURS_IN_MONTH = maxHoursInMonth;
    }

    public static void calculateEmpWage() {
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        while (totalEmpHrs <= MAX_HOURS_IN_MONTH && totalWorkingDays < NUM_WORKING_DAYS) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case 1:
                    empHrs = 8;
                    break;
                case 2:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
        }
        totalEmpWage = totalEmpHrs * WAGE_PER_HOUR;
    }

    public static int getTotalEmpWage() {
        return totalEmpWage;
    }
    public static void main(String[] args) {
        EmpAttendance emp = new EmpAttendance();
        emp.setWagePerHour(20);
        emp.setNumWorkingDays(20);
        emp.setMaxHoursInMonth(100);
        emp.calculateEmpWage();
        System.out.println("Total Employee Wage: " + emp.getTotalEmpWage());
    }
}







