package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App3logging {

    private static final Logger logger = LoggerFactory.getLogger("x.y");
    public static void main(String[] args) {

        logger.trace("Trace");
        logger.debug("Debug");
        logger.info("Info");
        logger.warn("Warn");
        logger.error("Error");


    }
}
