import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Exercise2ParameterizedLogging {
    private static final Logger logger = LoggerFactory.getLogger(Exercise2ParameterizedLogging.class);

    public static void main(String[] args) {
        String username = "nithya";
        int loginAttempts = 3;

        logger.info("User {} tried to login {} times", username, loginAttempts);
        logger.debug("Debugging info for user: {}", username);
    }
}