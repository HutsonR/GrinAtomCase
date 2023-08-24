package Solutions;

import java.util.Scanner;

public class SwapVariables {
    public static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("После обмена: a = "+a+", b = "+b);
    }
}
