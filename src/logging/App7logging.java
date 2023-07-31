package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;

public class App7logging {

    private static final Logger LOGGER = LoggerFactory.getLogger("app7");
    public static void main(String[] args) {

        //LOGGER.isInfoEnabled() faz uma verificacao se o logger no logback está habilitado. existe .IsVARIOS....
        //usamos para saber se o nível está habilitado na aplicação
        if(LOGGER.isInfoEnabled()) {
            LOGGER.info("Result: {}", calculate());

        }

        LOGGER.isEnabledForLevel(Level.TRACE);
    }

    private static int calculate()  {

        System.out.println("Calculando....");

        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            throw new RuntimeException("ops");
        }

        return 10;
    }

}
