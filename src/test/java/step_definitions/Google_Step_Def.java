package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.ActualWebPage;
import utils.Driver;

public class Google_Step_Def {


        WebDriver driver;
         // WebDriver driver;
        ActualWebPage actualWebPage;

        @Before
        public void setup() {
            // Set up the ChromeDriver instance with some options
            driver = Driver.getDriver();
        }


        @Given("user navigates to {string}")
        public void user_navigates_to(String url) {
            driver.get(url);
            actualWebPage = new ActualWebPage();
        }


        @Given("user enters {string} into the search box")
        public void user_enters_into_the_search_box(String searchTerm) {
                actualWebPage.googleSearchBox.sendKeys(searchTerm);
        }
        @When("user presses Search button")
        public void user_presses_search_button() {
                actualWebPage.searchButton.click();
        }
        @Then("user should see {string} in the URL")
        public void user_should_see_in_the_url(String searchTerm) {
                Assert.assertTrue(driver.getCurrentUrl().contains(searchTerm));
        }
        @Then("user should see {string} in the title")
        public void user_should_see_in_the_title(String searchTerm) {
                Assert.assertTrue(driver.getTitle().contains(searchTerm));
        }

    }

