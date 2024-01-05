Feature: US004 Amazon Testi

  Background: Anasayfaya gidilir
    Given kullanici parametreli method ile "https:amazon.com" sayfasina gider

  Scenario: TC01 Arama kutusunda java aratir
    Then kullanici parametreli method ile "java" aratir

  Scenario: TC03 Arama kutusunda sql aratir
    Then kullanici parametreli method ile "SQL" aratir

  Scenario: TC03 Arama kutusunda php aratir
    Then kullanici parametreli method ile "php" aratir
    And sayfayi kapatir

  # featue file'i daha dinamik hale getirebilmek icin gitmek istedigimiz url yada aratmak istedigimiz bir kelimeyi
  # "" tirnak icinde yazarak dinamik hale getirebiliriz. "" icinde yazdigimiz stepin methodunu olusturdugumuzda
  # parametreli bir method olusturulur. Dolayisiyla baska bir scenario da herhangi bir sayfaya gitmek istedigimizde bu
  # olusturmus oldugumuz parametreli method sayesinde sadece feature file'dan url'i degistirerek istedigimiz sayfaya
  # tekrar tekrar method olusturmadan gidebiliriz