package proje.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import proje.pages.AmazonPage;
import proje.utilities.ConfigReader;
import proje.utilities.Driver;

public class AmazonStepDefinition {
    AmazonPage amazonPage = new AmazonPage();

    @Given("Kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @Then("arama kutusunda iphone aratir")
    public void arama_kutusunda_iphone_aratir() {
        amazonPage.aramaKutusu.sendKeys("iphone", Keys.ENTER);
    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
       Driver.closeDriver();
    }
    @Then("arama kutusunda samsung aratilir")
    public void arama_kutusunda_samsung_aratilir() {

        amazonPage.aramaKutusu.sendKeys("samsung", Keys.ENTER);
    }

    @Given("kullanici parametreli method ile {string} sayfasina gider")
    public void kullaniciParametreliMethodIleSayfasinaGider(String url) {
        Driver.getDriver().get(url);
    }

    @Then("kullanici parametreli method ile {string} aratir")
    public void kullaniciParametreliMethodIleAratir(String kelime) {
        amazonPage.aramaKutusu.sendKeys(kelime,Keys.ENTER);
    }
}
