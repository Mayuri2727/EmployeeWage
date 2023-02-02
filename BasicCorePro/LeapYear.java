package BasicCorePro;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2012;                              // year to be checked
        boolean leap = false;

        if (year % 4 == 0) {                         //if the year is divided by 4

            if (year % 100 == 0) {                   // if the year is century

                if (year % 400 == 0)                 // if year is leap it divided by 400
                    leap = true;
                else
                    leap = false;
            } else                                   // if the year is not century
                leap = true;
        } else
            leap = false;

        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}
