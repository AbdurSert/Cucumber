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

    @FindBy(xpath = "/html/body/div[8]/div[4]/div[2]/div[1]/div[2]/ul/li[1]/div/div/div/div/div/ul/li[1]/div/a")
    public WebElement win10Button;

    @FindBy(xpath = "(//div[@class='s-item__title'])[2]")
    public WebElement win10UrunOzellik;

}
