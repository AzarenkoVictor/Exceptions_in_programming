
public class Messages {
    public static void arrUserData(String[] userData) {
        int count = 0;
        if (userData.length != 4) {
            System.out.println("Введите: Фамилия Имя Отчество Номер_телефона (без знака + и пробелов)");
            count++;
        }

        else {
            if (!userData[0].matches("[а-яА-Яa-zA-Z]+")) {
                System.out.println("Введите Фамилию заново");
                count++;
            }
            if (!userData[1].matches("[а-яА-Яa-zA-Z]+")) {
                System.out.println("Введите Имя заново");
                count++;
            }
            if (!userData[2].matches("[а-яА-Яa-zA-Z]+")) {
                System.out.println("Введите Отчество заново");
                count++;
            }
            try {
                Long.parseLong(userData[3]);
            } catch (NumberFormatException e) {
                System.out.println("Введите номер телефона заново");
                count++;
            }
        }

        if (count == 0) {
            StringBuilder text = new StringBuilder();
            for (int i = 0; i < userData.length; i++) {
                if (i == userData.length - 1) {
                    text.append(userData[i]);
                } else {
                    text.append(userData[i]).append(" ");
                }
            }
            Saving.savingFile(text.toString(), userData[0]);
        }
    }
}