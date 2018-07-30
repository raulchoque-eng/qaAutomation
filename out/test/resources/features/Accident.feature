Feature: Accident
  Scenario: I should be able to create an Accident
    Given Ultimate QA page is loaded
    When I log on the application
    And I go to see message "Bienvenido!!!!"
    And I go to the Accident tab
    Then I go to create Accident
    And I will to complete the accident form with
      |employee    |Jaime Terceros         |
      |accidentType|Accidentes electricos  |
      |description |Realizaba la conexión de un punto de iluminación en el piso 5 de la habitación matrimonial y fue electrocutado durante 5 segundos|
    And I go to log out
  Scenario: I should be able to search an Accident
    Given  I log on the application
    When I go to see message "Bienvenido!!!!"
    And I go to the Accident tab
    And  I go to search Accident
    And I go to search Accident by his Accident type "Atropellos"
    Then I go to see this employee "Harol"
    And I go to log out
  Scenario: I should be able to update an Accident
    Given Ultimate QA page is loaded
    #Given  I log on the application
    And I log on the application
    When I go to see message "Bienvenido!!!!"
    And I go to the Accident tab
    Then I go to see an accident register with name "Pedro"
    And I go to select buttonUpdate
    And I got to update his desccription "Estaba sobre la escalera realizando los cortes del pintado y cayo se rompe el cúbito del brazo izquierdo"