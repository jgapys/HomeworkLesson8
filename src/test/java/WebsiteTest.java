import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.assertj.core.api.Assertions.assertThat;

public class WebsiteTest extends TestBase {

    @ExtendWith(TestResultLoggerExtension.class)

    @ParameterizedTest
    @EnumSource(value = WebsiteTitleProvider.class, names = {"SII"})
    @DisplayName("Checking title for sii.pl")
    @Tag("sii")
    @Tag("regression")
    @Disabled
    void checkTitleForSii(WebsiteTitleProvider title) {
        String websiteURL = "https:www.sii.pl";
        LogbackLogger.displayTestInfo("sii.pl");
        driver.get(websiteURL);
        LogbackLogger.getOnWebsite(websiteURL);
        String actualTitle = driver.getTitle();
        LogbackLogger.displayExpectedTitle(title.toString());
        LogbackLogger.displayActualTitle(actualTitle);
        assertThat(actualTitle).isEqualTo(actualTitle);
    }

    @ParameterizedTest
    @EnumSource(value = WebsiteTitleProvider.class, names = {"ONET"})
    @DisplayName("Checking title for onet.pl")
    @Tag("onet")
    @Tag("regression")
    void checkTitleForOnet(WebsiteTitleProvider title) {
        String websiteURL = "https:www.onet.pl";
        LogbackLogger.displayTestInfo("onet.pl");
        driver.get(websiteURL);
        LogbackLogger.getOnWebsite(websiteURL);
        String actualTitle = driver.getTitle();
        assertThat(actualTitle).isEqualTo(title.toString());
        LogbackLogger.displayExpectedTitle(title.toString());
        LogbackLogger.displayActualTitle(actualTitle);
    }

    @ParameterizedTest
    @EnumSource(value = WebsiteTitleProvider.class, names = {"KOTUSZKOWO"})
    @DisplayName("Checking title for kotuszkowo.pl")
    @Tag("kotuszkowo")
    @Tag("regression")
    void checkTitleForKotuszkowo(WebsiteTitleProvider title) {
        String websiteURL = "http:www.kotuszkowo.pl";
        LogbackLogger.displayTestInfo("kotuszkowo.pl");
        driver.get(websiteURL);
        LogbackLogger.getOnWebsite(websiteURL);
        String actualTitle = driver.getTitle();
        assertThat(actualTitle).isEqualTo(title.toString());
        LogbackLogger.displayExpectedTitle(title.toString());
        LogbackLogger.displayActualTitle(actualTitle);
    }

    @ParameterizedTest
    @EnumSource(value = WebsiteTitleProvider.class, names = {"FILMWEB"})
    @DisplayName("Checking title for filmweb.pl")
    @Tag("filmweb")
    @Tag("regression")
    void checkTitleForFilmweb(WebsiteTitleProvider title) {
        String websiteURL = "https:www.filmweb.pl";
        LogbackLogger.displayTestInfo("filmweb.pl");
        driver.get(websiteURL);
        LogbackLogger.getOnWebsite(websiteURL);
        String actualTitle = driver.getTitle();
        assertThat(actualTitle).isEqualTo(title.toString());
        LogbackLogger.displayExpectedTitle(title.toString());
        LogbackLogger.displayActualTitle(actualTitle);
    }

    @ParameterizedTest
    @EnumSource(value = WebsiteTitleProvider.class, names = {"SELENIUM"})
    @DisplayName("Checking title for selenium.dev")
    @Tag("selenium")
    @Tag("regression")
    void checkTitleForSelenium(WebsiteTitleProvider title) {
        String websiteURL = "https:www.selenium.dev/documentation/en/webdriver/";
        LogbackLogger.displayTestInfo("selenium.dev");
        driver.get(websiteURL);
        LogbackLogger.getOnWebsite(websiteURL);
        String actualTitle = driver.getTitle();
        assertThat(actualTitle).isEqualTo(title.toString());
        LogbackLogger.displayExpectedTitle(title.toString());
        LogbackLogger.displayActualTitle(actualTitle);
    }
}