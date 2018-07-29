Feature: Departament

  Background: Login
    Given La página de concretec está cargado
    When Me conecto a la aplicación

  Scenario: Como usuario debo poder elminar un departamento
    Then hacemos click en la opcion departamento que se encuentra en el header

    And  hacemos click en deleted
    And  Hago click user
    And  Cerrar aplicacion
