// 1) Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class task01 {
    public static void main(String[] args) {
        System.out.println(divZeroError(109, 0));  // ArithmeticException
        System.out.println(pointerError());            // NullPointerException
        System.out.println(intError("abc"));       // NumberFormatException
    }

    private static int divZeroError(int a, int b) {
        return a / b;
    }

    private static int pointerError() {
        String a = null;
        return a.length();
    }

    public static int intError (String str) {
        return Integer.intError(str);
    }
}