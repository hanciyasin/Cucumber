Feature: US007 Google Testi

  Scenario Outline: : TC01 Google sayfasinda arama yapilir
    Given kullanici parametreli method ile propertiesten "googleUrl" sayfasina gider
    Then arama kutusunda listelenen "<arac>" aratir
    When sayfa basliginin listelenen "<arac>" icerdigini test eder
    And kullanici 2 saniye bekler
    And sayfayi kapatir
    Examples:
      | arac     |
      | porsche  |
      | audi     |
      | honda    |
      | mercedes |
      | bmw      |