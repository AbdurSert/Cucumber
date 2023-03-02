Feature: Kullanici urunleri sepete atar ve cikis yapar



    @checkOut

  Scenario: Kullaici birkac urunu sepete ekler ve urun sayilari sepette artar

      Given Kullanici ana sayfaya gider
      When Kullanici cookies i kabul eder
      And Kullanici pricing e tiklar
      And Kullanici satin al linkine tiklar
      And ana sayfaya tekrar doner
      And Kullanici tekrar pricing e tiklar
      And tekrar urun ekler
      And Kullanci tekrar ana sayfaya doner
      Then sepette urun sayisinin arttigini gorur






