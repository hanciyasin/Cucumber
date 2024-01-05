package proje.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import proje.utilities.Driver;

public class DataTablesPage {
    public  DataTablesPage (){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy (xpath = "(//button)[1]")
    public WebElement newButton;

    @FindBy (xpath = "(//input)[3]")
    public WebElement firstName;

    @FindBy (xpath = "(//input)[2]")
    public WebElement searchBox;

    @FindBy (xpath = "(//button)[4]")
    public  WebElement createButton;

    @FindBy (xpath = "(//tbody)")
    public WebElement dogrulama;
}
