Feature: Kullanici anasayfada searchBox kutusuna computer yazip Win10 ciktisi alir


    @ebaySearchBox

    Scenario: Ebay searchBox a veri gonderilip dogrulugu teyit edilir

      Given Kullanici ebay ana sayfayasina gider
      When Kullanici butun cookiesleri kabul eder
      And Kullanici searchBox a computer yazar
      And KUllanici arama butonuna basar
      And Kullanici Win10 secenegine tiklar
      Then Kullanici ilk cikan urunde win10 ozelligi oldugunu dogrular ve kapatir

