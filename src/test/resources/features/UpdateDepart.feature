Feature: Departament

  Background: Login
    Given La página de concretec está cargado
    When Me conecto a la aplicación

  Scenario: Como usuario debo poder actualizar un  departamento
    Then Presiono la opcion departamento que se encuentra en el header
    And hacemos click boton update departamento
    And actulizar el departmento
      | Ingresar el nombre | Departamento de Gerencia                         |
      | Ubicacion          | Av.Libertador                                    |
      | Telefono           | 4469333                                          |
      | Descripcion        | Departamento de Gerencia encargada de la empresa |
    And guardamos el nuevo departamento
    And  Hago click user
    And  Cerrar aplicacion