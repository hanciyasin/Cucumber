package proje.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import proje.pages.BlueRentalPage;
import proje.utilities.ConfigReader;
import proje.utilities.Driver;
import proje.utilities.ExcelReader;
import proje.utilities.ReusableMethods;

public class BlueRentalStepDefinition {
    BlueRentalPage blueRentalPage = new BlueRentalPage();
    @Given("Kullanici BlueRentalCar sayfasina gider")
    public void kullaniciBlueRentalCarSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));
    }

    @Then("Kullanici login butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {
        blueRentalPage.loginButton.click();
    }

    @And("Kullanici adi ve password girer")
    public void kullaniciAdiVePasswordGirer() {
        blueRentalPage.email.sendKeys(ConfigReader.getProperty("mail1"),
                Keys.TAB,ConfigReader.getProperty("password1"),Keys.ENTER);
    }

    @But("Kullanici farkli email ve password girer")
    public void kullaniciFarkliEmailVePasswordGirer() {
        blueRentalPage.email.sendKeys(ConfigReader.getProperty("mail2"),
                Keys.TAB,ConfigReader.getProperty("password2"),Keys.ENTER);
    }

    @And("kullanici {string} ve {string} bilgileri ile giris yapar")
    public void kullaniciVeBilgileriIleGirisYapar(String mail, String password) {
    blueRentalPage.email.sendKeys(ConfigReader.getProperty(mail),Keys.TAB,ConfigReader.getProperty(password),Keys.ENTER);
    }

    @Then("kullanici login oldugunu dogrular")
    public void kullaniciLoginOldugunuDogrular() {
        Assert.assertEquals("https://www.bluerentalcars.com/",Driver.getDriver().getCurrentUrl());
    }

    @And("verilen kullanici bilgileri ile login olur")
    public void verilenKullaniciBilgileriIleLoginOlur(DataTable data) {
        for (int i = 1; i < data.asList().size(); i++) {
            blueRentalPage.email.sendKeys(data.row(i).get(0),Keys.TAB,data.row(i).get(1),Keys.ENTER);
            ReusableMethods.bekle(1);
            Driver.getDriver().navigate().back();

        }
    }

    @And("exceldeki {string} sayfasindaki kullanici bilgileri ile Login olunur")
    public void exceldekiSayfasindakiKullaniciBilgileriIleLoginOlunur(String sayfaAdi) {
        String dosyaYolu = "src/test/resources/mysmoketestdata.xlsx";
        ExcelReader excelReader = new ExcelReader(dosyaYolu,sayfaAdi);
        for (int i = 1; i <=excelReader.rowCount() ; i++) {
            String email = excelReader.getCellData(i,0);
            String password = excelReader.getCellData(i,1);
            blueRentalPage.email.sendKeys(email,Keys.TAB,password,Keys.ENTER);
            ReusableMethods.bekle(2);
            Driver.getDriver().navigate().back();

        }


    }
}
