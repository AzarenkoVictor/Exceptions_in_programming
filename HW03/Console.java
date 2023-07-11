import java.util.Scanner;

public class Console {
    public static void start() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите через пробел: Фамилия Имя Отчество Номер_телефона(без + и пробелов) ");
        System.out.println("Для выхода введите stop ");
        boolean run = true;
        while (run) {
            String[] arr = in.nextLine().split(" ");
            if (arr[0].equalsIgnoreCase("stop")) {
                break;
            }
            Messages.arrUserData(arr);
        }
    }
}