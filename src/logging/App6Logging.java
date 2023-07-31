package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App6Logging {

    private static final Logger logger = LoggerFactory.getLogger("app6");
    public static void main(String[] args) {

        try{
            throw new RuntimeException("Ops");
        }catch (RuntimeException e){
            //logger.error tem uma sobrecarga que recebe um throwable que pode ser lancando junto com o logger
            //preferencialmente usar logger.error devido a ser o último nível da hierarquia e lancar o objeto para ver a stacktrace
            logger.error("Error Runtime!!!. " + e.getMessage() + ". Objeto -> " + e);
        }



    }
}
