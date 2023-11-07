package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TimeConversionFunctionalitySteps {
    WebDriver driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "Path_ChromeDriver");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Given("I am on the Time Converter page")
    public void iAmOnTheTimeConverterPage(){
        driver.get("https://qatimeconverter.ccbp.tech/");
    }

    @When("I click on the 'Convert to Seconds' button")
    public void iClickOnTheConvertToSecondsButton(){
        driver.findElement(By.id("convertBtn")).click();
    }

    @Then("an error message 'Please enter a valid number of hours.' should be visible")
    public void verifyHoursErrorTest(){
        String errorTest = driver.findElement(By.id("errorMsg")).getText();
        Assert.assertEquals(errorTest, "Please enter a valid number of hours.");
    }

    @Then("an error message 'Please enter a valid number of minutes.' should be visible")
    public void verifyMinutesErrorText() {
        String errorText = driver.findElement(By.id("errorMsg")).getText();
        Assert.assertEquals(errorText, "Please enter a valid number of minutes.");
    }

    @When("I enter a valid hours input")
    public void iEnterValidHoursInpput(){
        driver.findElement(By.id("inputHours")).sendKeys("2");
    }

    @And("I enter a valid minutes input")
    public void IEnterValidMinutesInput(){
        driver.findElement(By.id("inputMinutes")).sendKeys("30");
    }

    @Then("I can view the expected time conversion text")
    public void iViewExpectedTimeConversion(){
        String resultTest = driver.findElement(By.id("timeInSeconds")).getText();
        Assert.assertEquals(resultTest, "9000s");
    }
}
