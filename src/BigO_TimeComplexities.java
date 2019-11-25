/**
 * Each method is a case of different time complexity explained.
 */
public class BigO_TimeComplexities {

    /**
     * O(1) - Constant time
     * <p>
     * It means the time it takes to run is the same, regardless the input.
     */
    static void constant_time() {

        int x = 1234;

        System.out.println(x);
        System.out.println("The printing of x is constant time, because the time it takes to run" +
                " does not depend on the size of x.");
    }

    /**
     * O(log n) - Logarithmic time complexity
     * <p>
     * The running time grows in proportion to the logarithm of the input.
     */
    static void logarithmic_time() {

        int input = 100;

        for (int i = 1; i < input; i = i * 2) {
            System.out.println("Checking i: " + i);
        }
    }

    /**
     * O(n) - Linear time complexity
     * <p>
     * It means the time it takes to run is growing linearly with the size of the input.
     */
    static void linear_time() {

        int input = 100;

        for (int i = 1; i < input; i++) {
            System.out.println("Checking i: " + i);
        }
    }

    /**
     * O(n log n) - linearithmic time complexity
     * <p>
     * The running time grows in proportion to n log n of the input.
     * <p>
     * This will run 10 * log(10) times.
     */
    static void NLogN_time() {

        int n = 10;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n; j = j * 2) {
                System.out.println("Checking i,j: (" + i + "," + j + ")");
            }
        }
    }

    /**
     * O(n^p) - Polynomial time complexity
     * <p>
     * Slower than n log n time.
     * <p>
     * This algorithm will run 10^2 = 100 times
     * If we add another loop inside, this becomes 10^3 etc.
     */
    static void polynomial_time() {

        int n = 10;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println("Checking i,j: (" + i + "," + j + ")");
            }
        }
    }

    /**
     * O(k^n) - Exponential time complexity
     * <p>
     * This grows in proportion to some factor exponentiated by the input size.
     * <p>
     * This algorithm will run 2^10 = 1024 times
     */
    static void exponential_time() {

        int n = 10;

        for (int i = 1; i <= Math.pow(2, n); i++) {
            System.out.println("Checking: " + i);
        }
    }

    /**
     * O(n!) - Factorial time complexity
     * <p>
     * This shit grows proportionally to the factorial of the input size.
     * <p>
     * This algorithm will run n! times
     */
    static void factorial_time() {

        int n = 10;

        for (int i = 1; i <= factorial(n); i++) {
            System.out.println("Checking: " + i);
        }
    }

    static int factorial(int n) {

        if (n == 1) {
            return n;
        }
        return factorial(n - 1) * n;
    }

    public static void main(String args[]) {

        System.out.println("pick one...");

//        System.out.println("O(1) - Constant time");
//        constant_time();
//
//        System.out.println("O(log n) - Logarithmic time complexity");
//        logarithmic_time();
//
//        System.out.println("O(n) - Linear time complexity");
//        linear_time();
//
//        System.out.println("O(n log n) - linearithmic time complexity");
//        NLogN_time();
//
//        System.out.println("O(n^p) - Polynomial time complexity");
//        polynomial_time();
//
//        System.out.println("O(k^n) - Exponential time complexity");
//        exponential_time();
//
//        System.out.println("O(n!) - Factorial time complexity");
//        factorial_time();
    }

}
