package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.TelerikCheckOutPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class TelerikCheckOutSteps {

    TelerikCheckOutPage page= new TelerikCheckOutPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));



    @Given("Kullanici ana sayfaya gider")
    public void kullanici_ana_sayfaya_gider(){

        Driver.getDriver().get(ConfigReader.getProperty("projectUrl"));

    }

    @When("Kullanici cookies i kabul eder")
    public void kullanici_cookies_i_kabul_eder(){

       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Accept and Close']"))).click();

    }

    @And("Kullanici pricing e tiklar")
    public void kullanici_pricing_e_tiklar()  {

        page.pricingButton.click();

    }

    @And("Kullanici satin al linkine tiklar")
    public void kullanici_satin_al_linkine_tiklar() {

        page.buyNowButton.click();

    }

    @And("ana sayfaya tekrar doner")
    public void ana_sayfaya_tekrar_doner() {

       page.anaSayfaLogo.click();

    }

    @And("Kullanici tekrar pricing e tiklar")
    public void kullanici_tekrar_pricing_e_tiklar() {

        page.pricingButton.click();

    }

    @And("tekrar urun ekler")
    public void tekrar_urun_ekler() {

        page.BuyNowButton2.click();

    }

    @And("Kullanci tekrar ana sayfaya doner")
    public void kullanci_tekrar_ana_sayfaya_doner() {

        page.anaSayfaLogo.click();

    }

    @Then("sepette urun sayisinin arttigini gorur")
    public void sepette_urun_sayisinin_arttigini_gorur() {

        String ActuallQuantityOfProduct = page.siparisSayiCheck.getText();
        String ExpectedQuantityOfProduct = "2";

        Assert.assertTrue(ActuallQuantityOfProduct.contains(ExpectedQuantityOfProduct));

    }

    @And("kullanici sepete uzerindeki mevcut sayiyi alir")
    public void kullaniciSepeteUzerindekiMevcutSayiyiAlir() {

      String  amountOfProduct = page.siparisSayiCheck.getText();

    }

    @And("kullanici sepete tekrar gider")
    public void kullaniciSepeteTekrarGider() {

        page.checkOutIcon.click();

    }

    @And("kullanici sepetteki urunlerden bir tanesini Delete linki ile siler")
    public void kullaniciSepettekiUrunlerdenBirTanesiniDeleteLinkiIleSiler() {

        page.deleteButton.click();
    }

    @And("kullanici ana sayfaya geri doner")
    public void kullaniciAnaSayfayaGeriDoner() {

        page.anaSayfaLogo.click();
    }

    @Then("kullanici sepet simgesi uzerindeki sayinin bir eksildigini kontrol eder")
    public void kullaniciSepetSimgesiUzerindekiSayininBirEksildiginiKontrolEder() {

      String amountOfProductAfterDelete= page.siparisSayiCheck.getText();

      Assert.assertTrue( amountOfProductAfterDelete.equals("1"));
    }
}
