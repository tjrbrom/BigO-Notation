/**
 * O(log n) - Logarithmic time complexity
 * <p>
 * The running time grows in proportion to the logarithm of the input.
 */
public class LogarithmicTime {

    public static void main(String args[]) {

        int input = 100;

        for (int i = 1; i < input; i = i * 2) {
            System.out.println("Checking i: " + i);
        }

    }

}
