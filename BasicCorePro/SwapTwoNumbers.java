package BasicCorePro;


public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int t = 0;              // x and y are to swap

        System.out.println("Two Numbers: "+a + "  " + b);
        /*swapping */
        t = a;
        a = b;
        b = t;
        System.out.println("After Swap : "+a + "  " + b);
        System.out.println( );
    }
}

