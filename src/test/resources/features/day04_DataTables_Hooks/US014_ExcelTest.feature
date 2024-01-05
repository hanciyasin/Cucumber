Feature: US014 Excel Test

  Scenario: TC01 Exceldeki Email ve Password bilgileri ile Login olur
    Given Kullanici BlueRentalCar sayfasina gider
    Then Kullanici login butonuna tiklar
    And kullanici 2 saniye bekler
    And exceldeki "admin_info" sayfasindaki kullanici bilgileri ile Login olunur
    And kullanici 2 saniye bekler
    And sayfayi kapatir
