Feature: Cargo


  Scenario: I should be able to log on the application
    Given Ultimate QA page is loaded
    When I log on the application
    And I go to the All Cargo Tab
    And I go to create New Cargo
    And I will go fill the fields cargo
      |Nombre         | Supervisor de obra                                 |
      |Fecha Inicio   |  12-12-2012                                        |
      |Descripcion    |  Encargado de manejo de personal.                  |
   # And I left of the page
   # And I left to the app
    #Then I see the course "C# For QA Automation Engineers with Selenium Webdriver" in home page

  Scenario: I should be able to log on the application
    Given Ultimate QA page is loaded
    When I log on the application
    And I go to the All Cargo Tab
    And I go to modification Cargo
    And I will go fill the fields cargo
      |Nombre         | Supervisor de Supervisores                                 |
      |Fecha Inicio   |  12-12-2015                                        |
      |Descripcion    |  Encargado de manejo de manejo de obras                  |
   # And I left of the page
   # And I left to the app