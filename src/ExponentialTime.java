/**
 * O(k^n) - Exponential time complexity
 * <p>
 * This grows in proportion to some factor exponentiated by the input size.
 * <p>
 * This algorithm will run 2^10 = 1024 times
 */
public class ExponentialTime {

    public static void main(String args[]) {

        int n = 10;

        for (int i = 1; i <= Math.pow(2, n); i++){
            System.out.println("Checking: " + i);
        }

    }

}
