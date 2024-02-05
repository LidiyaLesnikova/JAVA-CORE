import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

/*
Написать функцию, добавляющую префикс к каждому из набора файлов, названия которых переданы ей
в качестве параметров через пробел.
 */
public class Task3 {
    public static void main(String[] args) {
        String listFiles = "file1.txt file2.txt file3.txt file4.txt", prefix = "buc-";
        addPrefix(listFiles, prefix);
    }

    private static void addPrefix(String listFiles, String prefix) {
        String[] arrListFiles = listFiles.split(" ");
        for (String file : arrListFiles) {
            if (Files.isRegularFile(Path.of(file))) {
                try {
                    Files.move(Path.of(file), Path.of(prefix + file), REPLACE_EXISTING);
                } catch (Exception e) {
                    System.out.println(e);
                }
            } else {
                try {
                    Files.createFile(Path.of(prefix + file));
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}
