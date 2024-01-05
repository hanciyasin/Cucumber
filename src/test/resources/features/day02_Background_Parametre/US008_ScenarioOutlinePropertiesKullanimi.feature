Feature: US007 Google Testi

  Scenario Outline: : TC01 Google sayfasinda arama yapilir
    Given kullanici parametreli method ile propertiesten "googleUrl" sayfasina gider
    Then arama kutusunda propertiesten listelenen "<arac>" aratir
    When sayfa basliginin propertiesten listelenen "<arac>" icerdigini test eder
    And kullanici 2 saniye bekler
    And sayfayi kapatir
    Examples:
      | arac  |
      | arac1 |
      | arac2 |
      | arac3 |
