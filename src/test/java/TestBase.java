import configuration.BrowserEnvironment;
import configuration.EnvironmentProperty;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.logging.Level;

public class TestBase {
    protected static WebDriver driver;
    private static BrowserEnvironment browserEnvironment;
    public static EnvironmentProperty environmentProperty;

    private static Logger logger = LoggerFactory.getLogger(TestBase.class);

    @BeforeAll
    static void setDriver() {
        //WebDriverManager.chromedriver().setup();
        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        environmentProperty = EnvironmentProperty.getInstance();
        browserEnvironment = new BrowserEnvironment();
        driver = browserEnvironment.getDriver();
        logger.debug("Driver started successfully");
    }

//    @BeforeEach
//    void setUp() {
//        driver = new ChromeDriver();
//        logger.info("New ChromeDriver initialization");
//        driver.manage().window().maximize();
//        logger.info("Maximize browser windows");
//    }

//    @AfterEach
//    void tearDown() {
//        try {
//            driver.quit();
//            logger.info("Driver process completed successfully");
//        } catch (Exception ex) {
//            logger.error("Error occurred: {}", ex);
//        }
//    }

    @AfterAll
    static void tearDown() {
        driver.quit();
        logger.debug("Driver closed");
    }
}