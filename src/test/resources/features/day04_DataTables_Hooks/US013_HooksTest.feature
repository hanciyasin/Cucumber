@AracHook
Feature: US006 Google Testi
  Scenario: TC01 Google sayfasinda arama yapilir
    Given kullanici parametreli method ile propertiesten "googleUrl" sayfasina gider
    Then arama kutusunda propertiesten "arac1" aratir
    When sayfa basliginin propertiesten "arac2" icerdigini test eder
    And kullanici 2 saniye bekler

  Scenario: TC02 Google sayfasinda arama yapilir
    Given kullanici parametreli method ile propertiesten "googleUrl" sayfasina gider
    Then arama kutusunda propertiesten "arac2" aratir
    When sayfa basliginin propertiesten "arac3" icerdigini test eder
    And kullanici 3 saniye bekler

  Scenario: TC03 Google sayfasinda arama yapilir
    Given kullanici parametreli method ile propertiesten "googleUrl" sayfasina gider
    Then arama kutusunda propertiesten "arac3" aratir
    When sayfa basliginin propertiesten "arac1" icerdigini test eder
    And kullanici 2 saniye bekler

