package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.Driver;

public class Hooks {

//    WebDriver driver;
//
//    @Before
//    public void setup() {
//        // Set up the ChromeDriver instance with some options
//        driver = Driver.getDriver();
//    }


    @After
    public void teardown(Scenario scenario) {
        System.out.println("Scenario = " + scenario.getName() + "\nStatus = " + scenario.getStatus());
        try {
            if (scenario.isFailed()) {
                byte[] screenshot = ((TakesScreenshot) Driver.getDriver())
                        .getScreenshotAs(OutputType.BYTES);

                scenario.attach(screenshot, "image/png", "Screenshot of failure");

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Driver.quitDriver();
        }
    }
}