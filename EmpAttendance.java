package EmpWage;

public class EmpAttendance {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
     public static void main(String[] args) {
            EmpWageBuilder dell = new EmpWageBuilder("Dell", 20, 2, 10);
            EmpWageBuilder hp = new EmpWageBuilder("HP", 10, 4, 20);
            dell.computeEmpWage();
            hp.computeEmpWage();

            System.out.println("Total Wage for company: " + dell.getCompany() + " is: " + dell.getTotalEmpWage());
            System.out.println("Total Wage for company: " + hp.getCompany() + " is: " + hp.getTotalEmpWage());
        }
    }



