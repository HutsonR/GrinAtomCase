package Solutions;

/**
 * The SwapVariables class provides a method for swapping two integer values.
 */
public class SwapVariables {

    /**
     * Swaps the values of two integers.
     *
     * @param a The first integer value.
     * @param b The second integer value.
     * @return An array containing the swapped values: [newA, newB].
     */
    public static int[] swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        return new int[]{a, b};
    }
}
