package pages;

import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class BasePage {

    public BasePage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Common elements from the header/footer and other elements
//    @FindBy(id = "logo")
//    public WebElement logo;
//
//    @FindBy(id = "dropdown-button")
//    public WebElement headerDropdown;
//
//    @FindBy(css = "#dropdown-menu a")
//    public List<WebElement> headerDropdownOptions;

}
