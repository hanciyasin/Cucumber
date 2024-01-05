#USER STORY : US_manager_login_test
#Scenario:kullanici tum manager login bilgileriyle giriş yapabilmeli
#Given kullanici ana sayfada
#When kullanici login sayfasina gider
#And kullanıcı adini girer
#And sifreyi girer
#And login buttoning basar
#Then login islemi gerçekleşir
#url : https://www.bluerentalcars.com/
#Managers:  "sam.walker@bluerentalcars.com","c!fas_art",
#		    "kate.brown@bluerentalcars.com","tad1$Fas",
#		    "raj.khan@bluerentalcars.com","v7Hg_va^",
#		    "pam.raymond@bluerentalcars.com”,"Nga^g6!"

Feature: US009 BlueRentalCar Login Islemi

  Scenario Outline: TC01 kullanici tum manager login bilgileriyle giris yapabilmeli
    Given Kullanici BlueRentalCar sayfasina gider
    Then Kullanici login butonuna tiklar
    And kullanici "<mail>" ve "<password>" bilgileri ile giris yapar
    Then kullanici login oldugunu dogrular
    And sayfayi kapatir
    Examples:
      | mail  | password  |
      | mail1 | password1 |
      | mail2 | password2 |
      | mail3 | password3 |
      | mail4 | password4 |

