/**
 * Each method is a case of different time complexity explained.
 */
public final class BigO_TimeComplexities {

    /**
     * O(1) - Constant time
     * <p>
     * It means the time it takes to run is the same, regardless the input.
     */
    static void constant() {

        int x = 123; // it's constant time, cause the time it takes to run does not depend on the size of x.
    }

    /**
     * O(log n) - Logarithmic time complexity
     * <p>
     * The running time grows in proportion to the logarithm of the input.
     */
    static void logarithmic() {

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
    static void linear() {

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
    static void NLogN() {

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
    static void polynomial() {

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
    static void exponential() {

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
    static void factorial() {

        int n = 10;

        for (int i = 1; i <= factorial(n); i++) {
            System.out.println("Checking: " + i);
        }
    }

    private static int factorial(int n) {

        if (n == 1) return n;

        return factorial(n - 1) * n;
    }

}
