import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InvestmentFundsSearchTest {

    private WebDriver webDriver;
    private String url;
    private String searchPhrase;

    private static final Logger LOGGER = Logger.getLogger(InvestmentFundsSearchTest.class.getName());

    @Before
    public void setUp() {
        LOGGER.info("Setting up the WebDriver and test data.");
        webDriver = new EdgeDriver();
        url = "https://www.bankmillennium.pl/";
        searchPhrase = "fundusz";
    }

    @Test
    public void isInvestmentFundRedirectUrlPresentAfterSearch() throws InterruptedException {
        LOGGER.info("Starting the search test.");

        webDriver.get(url);
        LOGGER.log(Level.INFO, "Navigating to URL: {0}", url);

        webDriver.findElement(By.id("search"))
                .sendKeys(searchPhrase);
        LOGGER.log(Level.INFO, "Entered search phrase: {0}", searchPhrase);

        webDriver.findElement(By.id("search"))
                .sendKeys(Keys.RETURN);
        LOGGER.info("Pressed Enter key.");

        Thread.sleep(1000);
        Assert.assertTrue(webDriver.findElement(By.xpath("//a[contains(@href,'https://www.bankmillennium.pl/klienci-indywidualni/inwestycje')]"))
                .isDisplayed());
        LOGGER.info("Assertion passed: Redirect URL is displayed.");

        LOGGER.info("Search test completed.");
    }

    @After
    public void tearDown() {
        LOGGER.info("Tearing down the WebDriver.");
        webDriver.quit();
    }
}
