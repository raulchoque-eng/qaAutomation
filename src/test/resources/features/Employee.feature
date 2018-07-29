# Login feature review the behavior in thie feature
#Nelson Alvaro Morante Nina
Feature: Employee

  Scenario: 0.- I should be able to create obra on the emplooyee
    Given Ultimate QA page is loaded
    When I log on the application
    And I go to the All Person and Cargo tab
    And I go to create new Cargo
    And I go to fill the fields to cargo
        |nombre     |administrador  |
        |fechaInicio|               |
        |descripcion|nuevo cargo    |
    Then I leave the system

  Scenario:1.- I should be able to create new employee on the emplooyee
    Given Ultimate QA page is loaded
    When I log on the application
    And I go to the All Person and employees tab
    And I go to the All create Employees tab
    And I go to the All Llenar campos employee Tab
        |nombre      |pedro        |
        |apellido    |campos       |
        |ci          |123          |
        |departamento|AVP          |
        |cargo       |administrador|
        |fechanacim  |2017-07-08   |
        |estadoCivil |  soltero    |
        |celular     |655448789    |
        |telefono    |44532567     |
        |direccion   |calle miraflores|


    And I go to the All Llenar campos Registro Perfil Tab
        |aniosExperiencia |5        |
        |sector         |Obra Gueza |
        |formacion      |aquitectura|
        |Especializacio |ormigones  |

    And I go to the All Llenar campos formulario Contrato  Tab
        |fechaInicio|               |
        |fechaFin   |               |
        |tipoContrato|  BBB         |
        |descripcion |nueva contrato|

    Then I leave the system


  Scenario: 2.- I should be able to search by departament
    Given Ultimate QA page is loaded
    When I log on the application
    And I go to the All Person and employees tab
    And I go to the button buscar obbra
        |buscar por departamento|AVN|
    Then I leave the system

  Scenario: 3.- I should be able to assing to obra
    Given Ultimate QA page is loaded
    When I log on the application
    And I go to the All Person and employees tab
    And i go to assign obra
        |Asignar a una obra|contrucciones Concretec|
    Then I leave the system