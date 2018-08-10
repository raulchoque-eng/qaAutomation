Feature: TipoDocumento


  Scenario: I should be able to log on the application
    Given Ultimate QA page is loaded
    When I log on the application
    And I go to the All TipoDocumento Tab
    And I go to create New TipoDocumento
    And I will go fill the fields tipoDocumento
      |Nombre         | Contrato por Area                                 |
      |Codigo         |  ACT                                        |
      |Descripcion    |  Contrato por Area, construccion nuevo edificio.                  |
   # And I left of the page
   # And I left to the app
    #Then I see the course "C# For QA Automation Engineers with Selenium Webdriver" in home page

  Scenario: I should be able to log on the application
    Given Ultimate QA page is loaded
    When I log on the application
    And I go to the All TipoDocumento Tab
    And I go to modification TipoDocumento
    And I will go fill the fields tipoDocumento
      |Nombre         | Contrato de Cambio                                 |
      |Codigo   | MAQ                                        |
      |Descripcion    |  Encargado de manejo de manejo de Maquinaria                  |
   # And I left of the page
   # And I left to the app