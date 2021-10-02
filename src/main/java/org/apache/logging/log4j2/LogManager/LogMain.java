package org.apache.logging.log4j2.LogManager;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class LogMain {
    static Logger logger = LogManager.getLogger();

    public static void main (String [] args) {
        logger.error("first log");

    }

}
