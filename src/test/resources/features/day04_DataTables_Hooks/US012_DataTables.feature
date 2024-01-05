Feature: US002 BlueRentalCar Login Test

  Scenario: TC01 BlueRentalCar Sayfasina Login olunur
    Given Kullanici BlueRentalCar sayfasina gider
    Then Kullanici login butonuna tiklar
    But kullanici 2 saniye bekler
    And verilen kullanici bilgileri ile login olur
      | email                         | password  |
      | sam.walker@bluerentalcars.com | c!fas_art |
      | raj.khan@bluerentalcars.com   | v7Hg_va^  |
    And sayfayi kapatir
