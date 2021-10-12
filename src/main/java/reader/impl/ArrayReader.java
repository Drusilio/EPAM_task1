package reader.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import reader.ArrayReaderInterface;

public class ArrayReader implements ArrayReaderInterface {
    private final static String PATH = "C:\\Users\\Админ\\IdeaProjects\\EPAM_task1\\src\\main\\resources\\file.txt";
    Logger logger = LogManager.getLogger();
    @Override
    public String read(String path) {


        return null;
    }


//    private static List<String> list;
//
//    public static List<String> getList() {
//        return list;
//    }
//
//    {
//        File file = new File(path);
//        FileReader fileReader = null;
//        try {
//            fileReader = new FileReader(file);
//            BufferedReader reader = new BufferedReader(fileReader);
//            String line = reader.readLine();
//            while (line != null) {
//                list.add(line);
//                line = reader.readLine();
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        catch (IOException e){
//            e.printStackTrace();
//        }
//    }

}
