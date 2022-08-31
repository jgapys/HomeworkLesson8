import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackLogger {
    private static Logger logger = LoggerFactory.getLogger(LogbackLogger.class);

    public static void displayTestInfo(String websiteTitle) {
        logger.info("Start testing: {}", websiteTitle);
    }

    public static void getOnWebsite(String websiteURL) {
        logger.info("Get on: {}", websiteURL);
    }

    public static void displayExpectedTitle(String expectedTitle) {
        logger.info("Expected title: {}", expectedTitle);
    }

    public static void displayActualTitle(String actualTitle) {
        logger.info("Actual title: {}", actualTitle);
    }

    public static void initializationNewWebDriver(String webDriverName) {
        logger.info("New {} initialization", webDriverName);
    }

    public static void displayMaximizeWindowInfo() {
        logger.info("Maximize browser windows");
    }

    public static void displayQuitProcessInfo() {
        logger.info("Driver process completed successfully");
    }

    public static void displayError(Exception errorType) {
        logger.error("Error occured: {}", errorType);
    }
}