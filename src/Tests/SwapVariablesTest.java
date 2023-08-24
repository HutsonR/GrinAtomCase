package Tests;

import Solutions.SwapVariables;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwapVariablesTest {
    @Test
    public void testSwap() {
        int a = 5;
        int b = 10;

        int[] result = SwapVariables.swap(a, b);

        assertEquals(b, result[0]);
        assertEquals(a, result[1]);
    }

    @Test
    public void testSwapWithNull() {
        int a = 0;
        int b = 0;

        int[] result = SwapVariables.swap(a, b);

        assertEquals(b, result[0]);
        assertEquals(a, result[0]);
    }

    @Test
    public void testSwapWithSameValues() {
        int a = 7;
        int b = 7;

        int[] result = SwapVariables.swap(a, b);

        assertEquals(b, result[0]);
        assertEquals(a, result[1]);
    }

    @Test
    public void testSwapWithNegativeValues() {
        int a = -3;
        int b = -8;

        int[] result = SwapVariables.swap(a, b);

        assertEquals(b, result[0]);
        assertEquals(a, result[1]);
    }

    @Test
    public void testSwapWithNegativeAndPositiveValues() {
        int a = -9;
        int b = 100;

        int[] result = SwapVariables.swap(a, b);

        assertEquals(b, result[0]);
        assertEquals(a, result[1]);
    }
}
