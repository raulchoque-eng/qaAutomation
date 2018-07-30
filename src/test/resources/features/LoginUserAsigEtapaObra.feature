# Login feature review the behavior in thie feature
Feature: LoginUserAsigEtapaObra

  Scenario: Tendria que poder iniciar cesion mi aplicacion
    Given La pagina CONCRETEC esta cargada
    When Inicio cesion en la aplicacion
    And Voy a la pestaña OBRA
    And  seleccionar obras
    When  Hago click en Asignar Etapas a la obra
    And llenar formulario asignacion Etapas a Obra

      |Etapas  |Etapa inicial de obra|
      |Description|Esta es la etapa inicial en donde se iniciia desde cero la obra|
    Then  Cierro la aplicacion