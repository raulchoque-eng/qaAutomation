# Login feature review the behavior in thie feature
Feature: LoginUserEtapa

  Scenario: Tendria que poder iniciar cesion mi aplicacion
    Given La pagina CONCRETEC esta cargada
    When Inicio cesion en la aplicacion
    And Voy a la pestaña OBRA
    And  seleccionar etapas
    And  Hago Click en CREAR ETAPA
    When llenar formulario registro Etapa

      |Nombre   |Etapa final de obra|
      |Codigo|Etp4|
      |Nro empleados|93|
    And Cierro la aplicacion
