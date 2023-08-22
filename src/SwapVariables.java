import java.util.Scanner;

public class SwapVariables {
    public static void test() {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.print("Введите a: ");
        a = scan.nextInt();
        System.out.print("Введите b: ");
        b = scan.nextInt();
        swap(a, b);
    }

    public static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("После обмена: a = "+a+", b = "+b);
    }
}
