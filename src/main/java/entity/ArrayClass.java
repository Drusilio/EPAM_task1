package entity;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ArrayClass {
        private static String filePath =
                "C:\\Users\\Lenovo\\IdeaProjects\\Lesson21.CRUD_App1\\"
                        + "EPAM_task1\\src\\main\\ForNumberArray.txt";

    public static String getFilePath() {
        return filePath;
    }

    public static int[] getArray() throws IOException {
        return Files.lines(Paths.get(getFilePath())).mapToInt(Integer::parseInt).toArray();
        }
}
