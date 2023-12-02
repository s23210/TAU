import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MailLoginTest {
    private WebDriver webDriver;
    private String url;
    private String userName;
    private String userPassword;

    private static final Logger LOGGER = Logger.getLogger(MailLoginTest.class.getName());

    @Before
    public void setUp() {
        LOGGER.info("Setting up the WebDriver and test data.");
        webDriver = new ChromeDriver();
        url = "https://profil.wp.pl/login/login.html";
        userName = "piotrek.piotr2023@wp.pl";
        userPassword = "1qaz2wsxXSW@ZAQ!";
    }

    @Test
    public void testMailLogin() throws InterruptedException {
        LOGGER.info("Starting the login test.");

        webDriver.get(url);
        LOGGER.log(Level.INFO, "Navigating to URL: {0}", url);

        Thread.sleep(1000);
        webDriver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[3]/div/button[2]"))
                .click();
        LOGGER.info("Clicked on the login button with xpath.");

        webDriver.findElement(By.id("login"))
                .sendKeys(userName);
        LOGGER.log(Level.INFO, "Entered username: {0}", userName);

        webDriver.findElement(By.id("password"))
                .sendKeys(userPassword);
        LOGGER.info("Entered password.");

        Thread.sleep(1000);
        webDriver.findElement(By.xpath("//button[@type='submit']"))
                .click();
        LOGGER.info("Clicked on the submit button.");

        Thread.sleep(1000);
        Assert.assertTrue(webDriver.findElement(By.xpath("//*[@id=\"1\"]"))
                .isDisplayed());
        LOGGER.info("Assertion passed: Element is displayed.");

        LOGGER.info("Login test completed.");
    }

    @After
    public void tearDown() {
        LOGGER.info("Tearing down the WebDriver.");
        webDriver.quit();
    }
}
