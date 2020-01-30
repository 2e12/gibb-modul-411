public class CollatzProcedure {
    public static void main(String[] args) {
        int n = 37;
        collatz_procedure(n);
    }

    public static void collatz_procedure(long n) {
        if (n > 0) {
            while (n != 1) {
                if (n % 2 == 0) {
                    // n ist gerade
                    n = n / 2;
                } else {
                    // n ist ungerade
                    n = 3 * n + 1;
                }
                System.out.println(n);
            }
        }
    }
}
