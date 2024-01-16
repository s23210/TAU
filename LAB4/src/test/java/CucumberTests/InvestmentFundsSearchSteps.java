package CucumberTests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InvestmentFundsSearchSteps {

    private WebDriver webDriver;
    private String url;
    private String searchPhrase;

    @Given("I am on the Bank Millennium website")
    public void givenIAmOnTheBankMillenniumWebsite() {
        webDriver = new EdgeDriver();
        url = "https://www.bankmillennium.pl/";
        searchPhrase = "fundusz";
    }

    @When("I enter the search phrase {string} and press Enter")
    public void whenIEnterTheSearchPhraseAndPressEnter(String searchPhrase) {
        webDriver.get(url);
        webDriver.findElement(By.id("search")).sendKeys(searchPhrase);
        webDriver.findElement(By.id("search")).sendKeys(Keys.RETURN);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("the Investment Fund redirect URL is displayed")
    public void thenTheInvestmentFundRedirectURLIsDisplayed() {
        Assert.assertTrue(webDriver.findElement(By.xpath("//a[contains(@href,'https://www.bankmillennium.pl/klienci-indywidualni/inwestycje')]")).isDisplayed());
        webDriver.quit();
    }
}
