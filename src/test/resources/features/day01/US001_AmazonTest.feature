Feature: US001 Amazon Sayfasi Testi
  @iphone
  Scenario: TC01 Arama kutusunda iPhone aratilir
    Given Kullanici amazon sayfasina gider
    Then arama kutusunda iphone aratir
    And sayfayi kapatir
  @samsung
    Scenario: TC02 Arama kutusunda samsung aratilir
      Given Kullanici amazon sayfasina gider
      Then arama kutusunda samsung aratilir
      And sayfayi kapatir