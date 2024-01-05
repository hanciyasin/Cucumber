Feature: US005 Google Testi
  Scenario: TC01 Google sayfasinda arama yapilir
    Given kullanici parametreli method ile "https:google.com" sayfasina gider
    Then arama kutusunda "ford" aratir
    When sayfa basliginin "ford" icerdigini test eder
    And kullanici 2 saniye bekler
    And sayfayi kapatir

    Scenario: TC02 Google sayfasinda arama yapilir
      Given kullanici parametreli method ile "https:google.com" sayfasina gider
      Then arama kutusunda "volvo" aratir
      When sayfa basliginin "volvo" icerdigini test eder
      And kullanici 3 saniye bekler
      And sayfayi kapatir

  Scenario: TC03 Google sayfasinda arama yapilir
    Given kullanici parametreli method ile "https:google.com" sayfasina gider
    Then arama kutusunda "audi" aratir
    When sayfa basliginin "audi" icerdigini test eder
    And kullanici 2 saniye bekler
    And sayfayi kapatir

