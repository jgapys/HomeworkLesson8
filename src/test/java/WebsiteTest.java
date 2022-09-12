import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WebsiteTest extends TestBase {

    private static Logger logger = LoggerFactory.getLogger(WebsiteTest.class);

    @Test
    @DisplayName("Checking title")
    @Tag("sii")
    @Tag("regression")
    void checkTitle() {
        logger.info(">>>> Start test >>>>>");
        String actualTitle = driver.getTitle();

        logger.info("Actual title: {}", actualTitle);
        logger.info("Expected title: {}", System.getProperty("title"));
        assertThat(actualTitle).isEqualTo(System.getProperty("title"));
    }

//    @ParameterizedTest
//    @EnumSource(value = WebsiteTitleProvider.class, names = {"SII"})
//    @ExtendWith(TestResultLoggerExtension.class)
//    @DisplayName("Checking title for sii.pl")
//    @Tag("sii")
//    @Tag("regression")
//    void checkTitleForSii(WebsiteTitleProvider title) {
//        String websiteURL = "https:www.sii.pl";
//        logger.info("Start testing: sii.pl");
//        driver.get(websiteURL);
//        logger.info("Get on: {}", websiteURL);
//        String actualTitle = driver.getTitle();
//        logger.info("Expected title: {}", title.toString());
//        logger.info("Actual title: {}", actualTitle);
//        assertThat(actualTitle).isEqualTo(title.toString());
//    }
//
//    @ParameterizedTest
//    @EnumSource(value = WebsiteTitleProvider.class, names = {"ONET"})
//    @ExtendWith(TestResultLoggerExtension.class)
//    @DisplayName("Checking title for onet.pl")
//    @Tag("onet")
//    @Tag("regression")
//    void checkTitleForOnet(WebsiteTitleProvider title) {
//        String websiteURL = "https:www.onet.pl";
//        logger.info("Start testing: onet.pl");
//        driver.get(websiteURL);
//        logger.info("Get on: {}", websiteURL);
//        String actualTitle = driver.getTitle();
//        logger.info("Expected title: {}", title.toString());
//        logger.info("Actual title: {}", actualTitle);
//        assertThat(actualTitle).isEqualTo(title.toString());
//    }
//
//    @ParameterizedTest
//    @EnumSource(value = WebsiteTitleProvider.class, names = {"KOTUSZKOWO"})
//    @ExtendWith(TestResultLoggerExtension.class)
//    @DisplayName("Checking title for kotuszkowo.pl")
//    @Tag("kotuszkowo")
//    @Tag("regression")
//    void checkTitleForKotuszkowo(WebsiteTitleProvider title) {
//        String websiteURL = "http:www.kotuszkowo.pl";
//        logger.info("Start testing: kotuszkowo.pl");
//        driver.get(websiteURL);
//        logger.info("Get on: {}", websiteURL);
//        String actualTitle = driver.getTitle();
//        logger.info("Expected title: {}", title.toString());
//        logger.info("Actual title: {}", actualTitle);
//        assertThat(actualTitle).isEqualTo(title.toString());
//    }
//
//    @ParameterizedTest
//    @EnumSource(value = WebsiteTitleProvider.class, names = {"FILMWEB"})
//    @ExtendWith(TestResultLoggerExtension.class)
//    @DisplayName("Checking title for filmweb.pl")
//    @Tag("filmweb")
//    @Tag("regression")
//    void checkTitleForFilmweb(WebsiteTitleProvider title) {
//        String websiteURL = "https:www.filmweb.pl";
//        logger.info("Start testing: filmweb.pl");
//        driver.get(websiteURL);
//        logger.info("Get on: {}", websiteURL);
//        String actualTitle = driver.getTitle();
//        logger.info("Expected title: {}", title.toString());
//        logger.info("Actual title: {}", actualTitle);
//        assertThat(actualTitle).isEqualTo(title.toString());
//    }
//
//    @ParameterizedTest
//    @EnumSource(value = WebsiteTitleProvider.class, names = {"SELENIUM"})
//    @ExtendWith(TestResultLoggerExtension.class)
//    @DisplayName("Checking title for selenium.dev")
//    @Tag("selenium")
//    @Tag("regression")
//    void checkTitleForSelenium(WebsiteTitleProvider title) {
//        String websiteURL = "https:www.selenium.dev/documentation/en/webdriver/";
//        logger.info("Start testing: selenium.dev");
//        driver.get(websiteURL);
//        logger.info("Get on: {}", websiteURL);
//        String actualTitle = driver.getTitle();
//        logger.info("Expected title: {}", title.toString());
//        logger.info("Actual title: {}", actualTitle);
//        assertThat(actualTitle).isEqualTo(title.toString());
//    }
}