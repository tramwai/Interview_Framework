package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActualWebPage extends BasePage{

    public ActualWebPage (){
        super();
    }

   // This is where I locate web elements that are contained
    // within the particular web page of my application

    @FindBy(name="q")
    public WebElement googleSearchBox;

    @FindBy(xpath = "//*[@name='btnK'][1]")
    public WebElement searchButton;

}
