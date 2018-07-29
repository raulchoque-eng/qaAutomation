# Login feature review the behavior in thie feature
Feature: TipoEquipo

  Scenario: I should be able to log on the application
    Given Ultimate QA page is loaded
    When I log on the application
    And I go to the All TipoEquipo Tab
    And I Select TipoEquipo
    And I select new TipoEquipo
    And I will go fill the fields of tipoEquipo
      |Nombre         |  Equipos de Construccion                  |
      |Codigo         |  EC                                       |
      |Descripcion    |  Equipos de Construccion de la Empresa    |
    And I left of the page TipoEquipo
    And I left to the app izzy
    #Then I see the course "C# For QA Automation Engineers with Selenium Webdriver" in home page
