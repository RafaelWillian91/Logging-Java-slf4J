package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App2logging {

    //O atributo logger é declarado como static porque, geralmente,
    // o uso mais comum do SLF4J em aplicativos Java é ter apenas uma instância de logger por classe
    private static final Logger logger = LoggerFactory.getLogger(App2logging.class);
    public static void main(String[] args) {

        logger.trace("Trace");
        logger.debug("Debug");
        logger.info("Info");
        logger.warn("Warn");
        logger.error("Error");

    }
}
