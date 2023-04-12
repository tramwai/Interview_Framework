package scripts;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.ActualWebPage;

public class ActualWebPageTest extends Base{

    //
    @BeforeMethod()
    public void setPage(){
        actualWebPage = new ActualWebPage();
    }


    @Test(priority = 1, description = "validate actual web page")
    public void validateActualWebPage(){
        Assert.assertTrue(actualWebPage.googleSearchBox.isDisplayed());
        Assert.assertTrue(actualWebPage.googleSearchBox.isEnabled());
        actualWebPage.googleSearchBox.sendKeys("google search" + Keys.ENTER);
    }
}
