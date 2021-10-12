package reader.impl;

import exception.UserException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import reader.ArrayReaderInterface;
import validator.StringValidator;

import java.io.*;

public class ArrayReader implements ArrayReaderInterface {
    Logger logger = LogManager.getLogger();

    @Override
    public String read(String path) throws UserException {
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(path)))) {
            String currentLine = reader.readLine();
            boolean isLineValid = false;
            while (!isLineValid && (currentLine = reader.readLine()) != null) {
                isLineValid = StringValidator.validate(currentLine);
            }

            if (currentLine == null) {
                logger.error("File path " + path + " containe not int-type data");
                throw new UserException("File path" + path + " containe not int-type data");
            }
            return currentLine;

        } catch (FileNotFoundException e) {
            logger.error("File on file path " + path + " not found", e);
            throw new UserException("File on file path " + path + " not found", e);
        } catch (IOException e) {
            logger.error("Input/Output operation is fail or interrupted while working with the file on file path " + path + ".", e);
            throw new UserException(
                    "Input/Output operation is fail or interrupted while working with the file on file path " + path + ".", e);
        }
    }
}
