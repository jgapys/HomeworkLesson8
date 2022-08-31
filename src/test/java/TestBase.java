import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.util.logging.Level;

public class TestBase {
    WebDriver driver;

    @BeforeAll
    static void setDriver() {
        WebDriverManager.chromedriver().setup();
        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
    }

    @BeforeEach
    @ExtendWith(TestResultLoggerExtension.class)
    void setUp() {
        driver = new ChromeDriver();
        LogbackLogger.initializationNewWebDriver("ChromeDriver");
        driver.manage().window().maximize();
        LogbackLogger.displayMaximizeWindowInfo();
    }

    @AfterEach
    void tearDown() {
        try {
            driver.quit();
            LogbackLogger.displayQuitProcessInfo();
        } catch (Exception ex) {
            LogbackLogger.displayError(String.valueOf(ex));
        }
    }
}