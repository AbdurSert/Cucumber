package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.TelerikSearchBoxPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TelerikSearchBoxSteps {


    TelerikSearchBoxPage telerikSearchBoxPage= new TelerikSearchBoxPage();

    @Given("Kullanici sitenin ana sayfasina gider")
    public void kullanici_sitenin_ana_sayfasina_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("projectUrl"));

    }
    @When("Kullanıcı Cookie için gelen seçeneklerden Accept and Close’a tıklar")
    public void kullanıcı_cookie_için_gelen_seçeneklerden_accept_and_close_a_tıklar() {

        telerikSearchBoxPage.acceptCookies.click();

    }
    @And("Kullanıcı üst menü bar dan arama simgesine tıklar")
    public void kullanıcı_üst_menü_bar_dan_arama_simgesine_tıklar() {

        telerikSearchBoxPage.searchIcon.click();

    }
    @And("Kullanıcı search box kutusuna {string} yazar.")
    public void kullanıcı_search_box_kutusuna_yazar(String aranacakKelimeler) {

        new Actions(Driver.getDriver()).sendKeys(telerikSearchBoxPage.searchBar, aranacakKelimeler).perform();

    }
    @And("Kullanıcı arama butonuna tıklar.")
    public void kullanıcı_arama_butonuna_tıklar() {

        telerikSearchBoxPage.searchButton.click();

    }
    @Then("Arama sonucu çıkan ilk seçeneğin ilgili {string} barındırdığı Assert edilir.")
    public void arama_sonucu_çıkan_ilk_seçeneğin_ilgili_barındırdığı_assert_edilir(String aranacakKelimeler) {

        String actuallTextOfSearch1 = aranacakKelimeler.substring(0, aranacakKelimeler.indexOf(" ")-1);
        String actuallTextOfSearch2 = aranacakKelimeler.substring(aranacakKelimeler.indexOf(" ") + 1, aranacakKelimeler.length()-1);
        System.out.println(aranacakKelimeler);
        String expectedTextOfSearch = telerikSearchBoxPage.firstResultOfSearch.getText().toLowerCase();
        System.out.println(expectedTextOfSearch);

        Assert.assertTrue(expectedTextOfSearch.contains(actuallTextOfSearch1));
        Assert.assertTrue(expectedTextOfSearch.contains(actuallTextOfSearch1));


    }


}
