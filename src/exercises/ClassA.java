package exercises;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassA {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClassA.class);
    public void log() {

        LOGGER.error("Erro No sistema A");

    }
}
