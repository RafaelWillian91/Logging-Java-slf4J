package appenders;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// The main function of RollingFileAppender is to writter records(logs) to disk log files.
//The rotation of these files automatically to prevent them growling indefinitely and taking up too much disk.
public class RollingFileAppender {

    private static final Logger LOGGER = LoggerFactory.getLogger(RollingFileAppender.class);
    public static void main(String[] args) {

        LOGGER.trace("TRACE()");
        LOGGER.debug("DEBUG()");
        LOGGER.info("INFO()");
        LOGGER.warn("WARN()");
        LOGGER.error("ERROR()");


    }
}
