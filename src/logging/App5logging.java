package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App5logging {

    private static final Logger logger = LoggerFactory.getLogger("app5");
    public static void main(String[] args) {

        int x = 10;
        int y = 40;

        logger.info("X: " + x + "; Y: " + y);
        logger.info("X: {}; Y: {}", x, y);

        //Do ponto de vista performático o melhor é a segunda opção na passagem para o logger.
        //Na primeira opção o java monta toda a estrutura da String para depois analisar o nível do logger
        //Na segunda ele não se da o trabalho de montar a String, ele já descarta ela se o nível do logger não corresponder
    }
}
