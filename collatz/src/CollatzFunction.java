public class CollatzFunction {
    public static void main(String[] args) {
        int n = 37;
        collatz_function(n);
    }

    public static void collatz_function(long n) {
        if (n > 0) {
            if (n % 2 == 0) {
                // n ist gerade
                n = n / 2;
            } else {
                // n ist ungerade
                n = 3 * n + 1;
            }
            System.out.println(n);
            if(n != 1) collatz_function(n);
        }
    }
}
