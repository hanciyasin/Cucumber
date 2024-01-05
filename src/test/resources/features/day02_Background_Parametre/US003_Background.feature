Feature: US003 Amazon Sayfasi Test
  #Feature file'daki scenariolarimizinda ortak adimlarimiz var ise bunun icin Feature: anahtar kelimesinden sonra
  #Background: anahtar kelimesini kullanabiliriz. Background @Before notasyonuna sahip bir method gibi
  #scenariolardan once calisir

  Background: Ana Sayfaya Gider
    Given Kullanici amazon sayfasina gider

  Scenario: TC01 arama kutusunda iphone aratilir
    * arama kutusunda iphone aratir

  Scenario: TC02 arama kutusunda samsung aratilir
    * arama kutusunda samsung aratilir
    * sayfayi kapatir

  #Given, Then, When, And gibi anahtar kelimeleri ile stepDefinition class'inda olusturdugumuz methodu
  #tekrar farkli bir scenarioda kullanmak istedigimizde bu anahtar kelimeler yerine *(yildiz) sembolu kullanabiliriz
