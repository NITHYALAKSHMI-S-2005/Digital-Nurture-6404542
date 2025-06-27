import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Exercise3AppenderExample {
    private static final Logger logger = LoggerFactory.getLogger(Exercise3AppenderExample.class);

    public static void main(String[] args) {
        logger.info("This message will appear in console and app.log file.");
        logger.warn("This is a warning in both console and file.");
        logger.error("Critical error logged in both outputs.");
    }
}