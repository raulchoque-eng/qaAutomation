# Login feature review the behavior in thie feature
Feature: Equipo

  Scenario: I should be able to log on the application
    Given Ultimate QA page is loaded
    When I log on the application
    And I go to the All Equipo Tab
    And I go to create New Equipo
    And I will go fill the fields
          |Nombre         |  Carretilla                                  |
          |Codigo         |  C123                                        |
          |TipoEquipo     |  Equipos de Maquinaria                       |
          |Descripcion    |  Equipo para trasladar "cemento, arena, etc" |
    And I left of the page
    And I left to the app
    #Then I see the course "C# For QA Automation Engineers with Selenium Webdriver" in home page
