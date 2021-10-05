package ArrayReader;

import java.io.*;
import java.util.List;

public class ArrayReader {
    private String path = "C:\\Users\\Lenovo\\IdeaProjects\\Lesson21.CRUD_App1\\EPAM_task1\\target\\ForNumberArray.txt";
    private static List<String> list;

    public static List<String> getList() {
        return list;
    }

    {
        File file = new File(path);
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            while (line != null) {
                list.add(line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
