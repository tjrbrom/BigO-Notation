/**
 * O(n log n) - Linear time complexity
 * <p>
 * The running time grows in proportion to n log n of the input.
 */
public class NLogNTime {

    public static void main(String args[]) {

        int n = 10;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < 8; j = j * 2) {
                System.out.println("Checking i,j: (" + i + "," + j + ")");
            }
        }

    }

}
