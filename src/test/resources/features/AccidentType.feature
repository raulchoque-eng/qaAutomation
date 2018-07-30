Feature: Accident type
  Scenario: I should be able to create an Accident Type
    Given Ultimate QA page is loaded
    And I log on the application
    When I go to see message "Bienvenido!!!!"
    Then I go to the Accident Type tab
    And I will to complete the accident type form with
      |nameAccidType    |Insendios y Explosiones|
      |descriptionAccTyp|Son eventos que generan perdidas e intencionadas en su mayoría|
    And I go to log out