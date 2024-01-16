package CucumberTests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MailLoginSteps {

    private WebDriver webDriver;
    private String url;
    private String userName;
    private String userPassword;

    @Given("I am on the WP Mail login page")
    public void givenIAmOnTheWPLoginPage() {
        webDriver = new ChromeDriver();
        url = "https://profil.wp.pl/login/login.html";
        userName = "piotrek.piotr2023@wp.pl";
        userPassword = "1qaz2wsxXSW@ZAQ!";
    }

    @When("I enter my username and password and click submit")
    public void whenIEnterUsernameAndPasswordAndClickSubmit() throws InterruptedException {
        webDriver.get(url);
        Thread.sleep(2000);
        webDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div/button[2]")).click();
        webDriver.findElement(By.id("login")).sendKeys(userName);
        webDriver.findElement(By.id("password")).sendKeys(userPassword);
        Thread.sleep(2000);
        webDriver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
    }

    @Then("I should see the mailbox")
    public void thenIShouldSeeTheMailbox() {
        Assert.assertTrue(webDriver.findElement(By.xpath("//*[@id=\"tabs-:rf:--tab-0\"]")).isDisplayed());
        webDriver.quit();
    }
}

