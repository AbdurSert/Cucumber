package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TelerikSearchBoxPage {

    public TelerikSearchBoxPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[text()='Accept and Close']")
    public WebElement acceptCookies;

    @FindBy(id = "js-tlrk-nav-search-link")
    public  WebElement searchIcon;

    @FindBy(css = "input[class='TK-Tag-Input']")
    public WebElement searchBar;

    @FindBy(css = "button[class='TK-Tag-Input-Button']")
    public WebElement searchButton;

    @FindBy(xpath = "(//h4[@class='TK-Search-Results-List-Item-H'])[1]")
    public WebElement firstResultOfSearch;


}
