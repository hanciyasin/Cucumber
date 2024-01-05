package proje.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // Cucumber ile JUnit'in entegre olmasini saglayan scenerio calistiran notasyon
@CucumberOptions(
        plugin = {
                "pretty", // pretty -> konsolda scenariolar ile ilgili ayrintili bilgi verir
                "html:target/default-cucumber-reports.html",  //rapor pluginleri
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-reports/cucumber.xml",
                "rerun:TestOutput/failed_scenario.txt"},
        /*
        rerun plugin'i sayesinde fail olan scenario'larimizi yolunu belirttigimiz .txt dosyasi icinde tutacaktir
         */
        features = "src/test/resources/features", //-->features package'ının yolu (content root) belirtilir
        glue = {"proje/stepDefinitions"}, //-->stepDefinitions package'ı belirtilir
        tags = "@iphone")
//-->Burda belirttiğimiz tag'i hangi scenario da belirtirsek o scenariolar çalışır // and ve or kullanilabilir
public class Runner {
}
/*
   Runner class'ı testNG deki xml file gibi istediğimiz scenario'lari tek seferde çalıştırmamıza yardımcı olur
    @CucumberOptions notasyonu ile scenarioların nasıl çalışacağı hangi raporu kullanacağı ile alakalı
    parametreler içeren notasyondur

      dryRun parametresi eğer true seçilirse scenariolari çalıştırmadan feature file daki steplerin
    stepDefinition class'ındaki methodlar ile uyuşuğ uyuşmadığını kontrol eder ve browser'ı çalıştırmaz
 */
