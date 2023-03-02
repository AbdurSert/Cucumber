package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EbayPages {

    public EbayPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "gdpr-banner-accept")
    public WebElement acceptAllCookies;

    @FindBy(css = "input[class='gh-tb ui-autocomplete-input']")
    public WebElement searchBox;

    @FindBy(id = "gh-btn")
    public WebElement findButton;

    @FindBy(xpath = "(//font[text()='windows 10'])[2]")
    public WebElement win10Button;

    @FindBy(xpath = "//font[text()='HP 800 G1 Computer SFF PC Intel 4th Gen 4-32GB 250-1000GB SSD&HDD Windows 10 PRO']")
    public WebElement win10UrunOzellik;


}
