#https://editor.datatables.net adresine gidiniz
# Sayfadaki tabloda new butonuna basalım
# Çıkan pencerede verilen bilgileri girelim
# Create butonuna basalım
# Search bölümüne girdiğimiz firstname bilgisini girelim
# Başarılı bir şekilde giriş yapıldığını doğrulayalım
# Sayfayı kapatalım

Feature: US010 DataTables Test

  Scenario Outline: TC01 DataTables Veri Girisisi
    Given kullanici parametreli method ile "https://editor.datatables.net" sayfasina gider
    And kullanici 1 saniye bekler
    Then kullanici sayfada new butonuna basar
    And kullanici 1 saniye bekler
    Then kullanici acilan sayfaya "<firstName>","<LastName>","<position>","<office>","<extension>","<startDate>" ve "<salary>" bilgilerini girer
    And create butonuna basar
    And kullanici 1 saniye bekler
    Then kullanici search kismina "<firstName>" bilgisini girer
    And kullanici 1 saniye bekler
    And kullanici "<firstName>" ile basarili bir kayit yapildigini dogrular
    And kullanici 1 saniye bekler
    And sayfayi kapatir
    Examples:
      | firstName | LastName | position | office | extension | startDate  | salary |
      | mahmut    | kemal    | mudur    | office | dr        | 2023-08-10 | 3000   |
