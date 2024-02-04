/*
 * Написать функцию, создающую резервную копию всех файлов в директории(без поддиректорий)
 * во вновь созданную папку ./backup
 */

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class Task1 {
    public static void main(String[] args) {
        madeBackup();
        System.out.println("all files have been backed up");
    }

    public static void madeBackup() {
        Path backupPath = Path.of("./backup");
        if (!Files.isDirectory(backupPath)) {
            try {
                Files.createDirectory(backupPath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try (DirectoryStream<Path> files = Files.newDirectoryStream(Path.of("."))) {
            for (Path fpath : files) {
                if (Files.isRegularFile(fpath)) {
                    Files.copy(fpath, Path.of(backupPath+"\\"+fpath.getFileName()), REPLACE_EXISTING);
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}

