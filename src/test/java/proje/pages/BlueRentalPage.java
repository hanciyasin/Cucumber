package proje.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import proje.utilities.Driver;

import java.security.PublicKey;

public class BlueRentalPage {
    public BlueRentalPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath ="(//li//a)[1]")
    public WebElement loginButton;
    @FindBy (xpath ="(//input)[1]")
    public WebElement email;
}
