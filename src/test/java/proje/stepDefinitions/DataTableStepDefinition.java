package proje.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import proje.pages.DataTablesPage;
import proje.utilities.ConfigReader;
import proje.utilities.Driver;

public class DataTableStepDefinition {
    DataTablesPage dataTablesPage  = new DataTablesPage();


    @Then("kullanici sayfada new butonuna basar")
    public void kullaniciSayfadaNewButonunaBasar() {
        dataTablesPage.newButton.click();
    }

    @Then("kullanici acilan sayfaya {string},{string},{string},{string},{string},{string} ve {string} bilgilerini girer")
    public void kullaniciAcilanSayfayaVeBilgileriniGirer(String name, String lastName, String position, String office, String extension, String date, String salary) {
    dataTablesPage.firstName.sendKeys(name, Keys.TAB,lastName,Keys.TAB,position,Keys.TAB,office,Keys.TAB,extension,Keys.TAB,date,Keys.TAB,salary);
    }

    @And("create butonuna basar")
    public void createButonunaBasar() {
        dataTablesPage.createButton.click();
    }

    @Then("kullanici search kismina {string} bilgisini girer")
    public void kullaniciSearchKisminaBilgisiniGirer(String name) {
        dataTablesPage.searchBox.sendKeys(name,Keys.ENTER);
    }

    @And("kullanici {string} ile basarili bir kayit yapildigini dogrular")
    public void kullaniciIleBasariliBirKayitYapildiginiDogrular(String name) {
        Assert.assertTrue(dataTablesPage.dogrulama.getText().contains(name));
    }
}
