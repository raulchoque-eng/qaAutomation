Feature: Departament

  Background: Login
    Given La página de concretec está cargado
    When Me conecto a la aplicación

  Scenario: Como usuario debo poder registrar un nuevo departamento
    Then Presiono en la opcion departamento que se encuentra en el header
    And registramos una nuevo departamento
    And llenar el formulario del departmento
      | Ingresar el nombre | Departamento de Administracion                                              |
      | Ubicacion          | Av.America                                                                  |
      | Telefono           | 4446633                                                                     |
      | Descripcion        | Departamento de Administracion encargado de la administracion de la empresa |
    And registramos el nuevo departamento
    And  Hago click user
    And  Cerrar aplicacion
