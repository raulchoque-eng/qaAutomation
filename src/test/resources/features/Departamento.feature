Feature: Departament

  Background: Login
    Given La página de concretec está cargado
    When Me conecto a la aplicación

  Scenario: Como usuario debo poder registrar un nuevo departamento
    Then Presiono en la opcion departamento que se encuentra en el header
    And registramos una nuevo departamento
    And llenar el formulario del departmento
      | Ingresar el nombre | rudy       |
      | Ubicacion          | Av.putitas |
      | Telefono           | 44456215   |
      | Descripcion        | asdasdasd  |
    And registramos el nuevo departamento
    And  Hago click user
    And  Cerrar aplicacion