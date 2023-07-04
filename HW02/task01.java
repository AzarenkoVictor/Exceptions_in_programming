import java.util.Scanner;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
//и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
//вместо этого, необходимо повторно запросить у пользователя ввод данных.

public class task01 {
    public static void main(String[] args) {
        parseNumber();
    }

    public static void parseNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число: ");
        String inputNumber = scanner.nextLine();
        try {
            float number = Float.parseFloat(inputNumber);
            System.out.println("Вы ввели: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели не корректное число! Введите дробное число !");
            parseNumber();
        }
        scanner.close();
    }
}