import java.util.Scanner;

//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

public class task04 {
    public static void main(String[] args) {
        inputString();
    }

    private static void inputString() {
        System.out.println("Введите текст: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        if (string.equals("")) {
            throw new RuntimeException("пустые строки вводить нельзя!");

        }
        System.out.println("Введенная строка: " + string);
        scanner.close();
    }
}