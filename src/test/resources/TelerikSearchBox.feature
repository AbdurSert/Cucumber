Feature: Kullanici arama kutucuguna kelime yazip aratir

  Background:
    Given Kullanici sitenin ana sayfasina gider

  @telerikSearchBox

  Scenario Outline: Kullanici farkli kelimler ile arama yapar.

    When Kullanıcı Cookie için gelen seçeneklerden Accept and Close’a tıklar
    And Kullanıcı üst menü bar dan arama simgesine tıklar
    And Kullanıcı search box kutusuna "<aranacakKelimeler>" yazar.
    And Kullanıcı arama butonuna tıklar.
    Then Arama sonucu çıkan ilk seçeneğin ilgili "<aranacakKelimeler>" barındırdığı Assert edilir.


    Examples:
    |aranacakKelimeler|
    |keyword |
    |data    |