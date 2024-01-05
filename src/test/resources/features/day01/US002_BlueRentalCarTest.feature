Feature: US002 BlueRentalCar Login Test
  Scenario: TC01 BlueRentalCar Sayfasinda Login Olunur
    Given Kullanici BlueRentalCar sayfasina gider
    Then Kullanici login butonuna tiklar
    And Kullanici adi ve password girer
    And sayfayi kapatir

  Scenario: TC02 BlueRentalCar Sayfasinda Login Olunur
    Given Kullanici BlueRentalCar sayfasina gider
    Then Kullanici login butonuna tiklar
    But Kullanici farkli email ve password girer
    And sayfayi kapatir
