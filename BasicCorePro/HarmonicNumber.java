package BasicCorePro;
// compute 1/1 + 1/2 + 1/3 + ... + 1/n
public class HarmonicNumber {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        System.out.println(sum);                    // print the nth harmonic number
    }
}
