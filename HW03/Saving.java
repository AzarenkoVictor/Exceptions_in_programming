import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Saving {
    public static void savingFile(String text, String name) {
        boolean indicatorFile = false;
        String str = "";
        if (Files.exists(Path.of(name + ".txt"))) {
            str = readingFile(name);
            if (!str.contains(text)) {
                indicatorFile = true;
                writingFile(name, text, indicatorFile);
                System.out.println("Данные добавлены");
            } else {
                System.out.println("Данные дублируются");
            }
        } else {
            writingFile(name, text, indicatorFile);
            System.out.println("Файл " + name + ".txt успешно создан");
        }
    }

    public static String readingFile(String name) {
        try (FileReader reader = new FileReader(name + ".txt")) {
            int c;
            StringBuilder str = new StringBuilder();
            while ((c = reader.read()) != -1) {
                str.append((char) c);
            }
            return str.toString();
        } catch (IOException e) {
            throw new RuntimeException("Ошибка в чтения файла " + e);
        }
    }

    public static void writingFile(String name, String text, boolean indicator) {
        try (FileWriter writer = new FileWriter(name + ".txt", indicator)) {
            writer.write(text + "\n");
        } catch (IOException e) {
            throw new RuntimeException("Ошибка в записи файла" + e);
        }
    }
}