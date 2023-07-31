package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logging {

    //Esse método é usado para obter uma instância de um logger com base no nome da classe passado como argumento.
    private static final Logger LOGGER = LoggerFactory.getLogger(Logging.class);
    public static void main(String[] args) {

        LOGGER.info("This is my first event logging");
        LOGGER.debug("This is a debug message");
    }
}
