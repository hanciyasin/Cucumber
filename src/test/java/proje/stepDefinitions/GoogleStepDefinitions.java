package proje.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import proje.pages.GooglePage;
import proje.utilities.ConfigReader;
import proje.utilities.Driver;
import proje.utilities.ReusableMethods;

import java.security.Key;

public class GoogleStepDefinitions {
    GooglePage googlePage = new GooglePage();
    @Then("arama kutusunda {string} aratir")
    public void aramaKutusundaAratir(String kelime) {
        googlePage.googleAramakutusu.sendKeys(kelime, Keys.ENTER);
    }

    @When("sayfa basliginin {string} icerdigini test eder")
    public void sayfaBasligininIcerdiginiTestEder(String kelime) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(kelime));
    }

    @And("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int saniye) {
        ReusableMethods.bekle(saniye);
    }

    @Given("kullanici parametreli method ile propertiesten {string} sayfasina gider")
    public void kullaniciParametreliMethodIlePropertiestenSayfasinaGider(String googleUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(googleUrl));
    }

    @Then("arama kutusunda propertiesten {string} aratir")
    public void aramaKutusundaPropertiestenAratir(String arac) {
        googlePage.googleAramakutusu.sendKeys(ConfigReader.getProperty(arac),Keys.ENTER);
    }

    @When("sayfa basliginin propertiesten {string} icerdigini test eder")
    public void sayfaBasligininPropertiestenIcerdiginiTestEder(String arac) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(ConfigReader.getProperty(arac)));
    }

    @Then("arama kutusunda listelenen {string} aratir")
    public void aramaKutusundaListelenenAratir(String arac) {
        googlePage.googleAramakutusu.sendKeys(arac,Keys.ENTER);

    }

    @When("sayfa basliginin listelenen {string} icerdigini test eder")
    public void sayfaBasligininListelenenIcerdiginiTestEder(String arac) {
       Assert.assertTrue(Driver.getDriver().getTitle().contains(arac));
    }

    @Then("arama kutusunda propertiesten listelenen {string} aratir")
    public void aramaKutusundaPropertiestenListelenenAratir(String arac) {
        googlePage.googleAramakutusu.sendKeys(ConfigReader.getProperty(arac),Keys.ENTER);
    }

    @When("sayfa basliginin propertiesten listelenen {string} icerdigini test eder")
    public void sayfaBasligininPropertiestenListelenenIcerdiginiTestEder(String arac) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(ConfigReader.getProperty(arac)));
    }

    @Then("kullanici verilen bilgiler ile arama yapar")
    public void kullaniciVerilenBilgilerIleAramaYapar(DataTable dataTable) {
        System.out.println(dataTable.asList()); //[Araclar, Volvo, Audi, BMW]
        for (int i = 1; i < dataTable.asList().size(); i++) {
            googlePage.googleAramakutusu.sendKeys(dataTable.asList().get(i),Keys.ENTER);
            ReusableMethods.bekle(1);
            Assert.assertTrue(Driver.getDriver().getTitle().contains(dataTable.asList().get(i)));
            googlePage.googleAramakutusu.clear();
            ReusableMethods.bekle(1);

        }
    }
}
