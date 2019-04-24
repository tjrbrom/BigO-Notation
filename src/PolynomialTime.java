/**
 * O(n^p) - Polynomial time complexity
 * <p>
 * Slower than n log n time.
 * <p>
 * This algorithm will run 10^2 = 100 times
 * If we add another loop inside, this becomes 10^3 etc.
 */
public class PolynomialTime {

    public static void main(String args[]) {

        int n = 10;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println("Checking i,j: (" + i + "," + j + ")");
            }
        }

    }

}
