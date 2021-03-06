package pl.tmobile.prepaidqa.qagui.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pl.tmobile.prepaidqa.qagui.bdd.ConfigBaseStep;

import java.util.Map;

import static junit.framework.Assert.assertEquals;


public class ParamBddSteps {

    private WebDriver driver;

    public ParamBddSteps(ConfigBaseStep configBaseStep) {
        this.driver = configBaseStep.setUpWebDriver();
    }

    @Given("website has got title")
    public void websiteHasGotTitle(Map<String, String> dataMap) {
        String website = dataMap.get("website");
        String title = dataMap.get("title");
        driver.navigate().to(website);
        assertEquals(driver.getTitle(), title);

    }

    @Given("Name of the website {string}")
    public void nameOfTheWebsite(String arg0) {
        driver.navigate().to(arg0);
    }

    @Then("Title is {string}")
    public void titleIs(String arg0) {
        assertEquals(driver.getTitle(), arg0);
    }

    @Given("Name of the website is {}")
    public void nameOfTheWebsiteIsWebsite(String arg0) {
        driver.navigate().to(arg0);
    }

    @Then("Title of this website is {}")
    public void titleOfThisWebsiteIsTitle(String arg1) {
        assertEquals(driver.getTitle(), arg1);
    }
}
