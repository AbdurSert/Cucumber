package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TelerikCheckOutPage {

    public TelerikCheckOutPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[text()='Accept and Close']")
    public WebElement acceptCookies;

    @FindBy(xpath = "(//a[@class='TK-Menu-Item-Link'])[5]")
    public WebElement pricingButton;

    @FindBy(xpath = "(//a[@class='Btn Btn--prim4 u-db'])[1]")
    public WebElement buyNowButton;

    @FindBy(css ="a[class='TK-TLRK-Logo']" )
    public WebElement anaSayfaLogo;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[1]/div/div/div[1]/table/thead/tr[5]/th[2]/div/a")
    public WebElement BuyNowButton2;

    @FindBy(css = "span[class='TK-Counter TK-Counter--SC TK-Counter--Visible']")
    public WebElement siparisSayiCheck;




}

