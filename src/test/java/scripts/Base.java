package scripts;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import pages.ActualWebPage;
import pages.BasePage;
import utils.ConfigReader;
import utils.Driver;
public class Base {
    // WebDriver declared
    WebDriver driver;
    //Declare SoftAssert
    SoftAssert softAssert;
    BasePage basePage;
    //Instantiate all of my web application pages
    ActualWebPage actualWebPage;
    @BeforeMethod
    public void setup() {
        driver = Driver.getDriver();
        //softAssert = new SoftAssert();
        driver.get(ConfigReader.getProperty("appURL"));
        basePage = new BasePage();
        //
    }
    @AfterMethod
    public void teardown() {
        //We will quit driver and do other proper clean-ups
        //softAssert.assertAll();
        Driver.quitDriver();
    }
}












