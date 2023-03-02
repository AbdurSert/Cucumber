package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.EbayPages;
import utilities.ConfigReader;
import utilities.Driver;
import java.time.Duration;


public class EbaySearchBox {

    EbayPages ebayPages = new EbayPages();
    Actions action =  new Actions(Driver.getDriver());

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));


    @Given("Kullanici ebay ana sayfayasina gider")
    public void kullanici_ebay_ana_sayfayasina_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("projectUrl"));
    }

    @When("Kullanici butun cookiesleri kabul eder")
    public void kullanici_butun_cookiesleri_kabul_eder() {

        WebElement cookie = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gdpr-banner-accept")));
        action.click(cookie).perform();
    }

    @And("Kullanici searchBox a computer yazar")
    public void kullanici_search_box_a_computer_yazar() {

       action.click(ebayPages.searchBox).sendKeys("computer").perform();
    }

    @And("KUllanici arama butonuna basar")
    public void k_ullanici_arama_butonuna_basar() {

        action.click(ebayPages.findButton).perform();
    }

    @And("Kullanici Win10 secenegine tiklar")
    public void kullanici_win10_secenegine_tiklar() {

       ebayPages.win10Button.click();
    }

    @Then("Kullanici ilk cikan urunde win10 ozelligi oldugunu dogrular ve kapatir")
    public void kullanici_ilk_cikan_urunde_win10_ozelligi_oldugunu_dogrular_ve_kapatir() {

        String actualtextwin10 = ebayPages.win10UrunOzellik.getText();
        String expectedtextwin10 = "Win10";
        Assert.assertTrue(actualtextwin10.contains(expectedtextwin10));

        Driver.closeDriver();
    }
}
