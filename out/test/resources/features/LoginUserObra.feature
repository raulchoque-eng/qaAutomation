# Login feature review the behavior in thie feature
Feature: LoginUserObra

  Scenario: Tendria que poder iniciar cesion mi aplicacion
    Given La pagina CONCRETEC esta cargada
    When Inicio cesion en la aplicacion
    And Voy a la pestaña OBRA
    And  seleccionar obras
    When  Hago Click en CREAR OBRA
    And llenar formulario registro Obra

      |Nombre   |Edificio Las Lomas de Aranjuez|
      |Codigo|Edif9|
      |Ubicacion|Av. circunvalacion y potosi|
      |Description|Obra iniciaada desde la etapa inicial, hasta culminar la obra|

    And Cierro la aplicacion










