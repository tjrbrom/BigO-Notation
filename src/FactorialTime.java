/**
 * O(n!) - Factorial time complexity
 * <p>
 * This shit grows proportionally to the factorial of the input size.
 * <p>
 * This algorithm will run n! times
 */
public class FactorialTime {

    public static void main(String args[]) {

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

}
