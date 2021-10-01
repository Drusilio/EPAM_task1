package main;

import java.io.IOException;

import entity.ArrayClass;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import service.ArrayAverege;

public class Main {
    static Logger logger = LogManager.getLogger();
    private static String errorNFEMessage =
            "В переданном файле присутсвует как минимум один элемент, не являющийся целым числом";
    public static void main (String[] args) throws IOException {
        try {
            System.out.println(ArrayAverege.arrayAverage(ArrayClass.getArray()));
        } catch (NumberFormatException e) {
            logger.error(errorNFEMessage);
        }

    }
}
