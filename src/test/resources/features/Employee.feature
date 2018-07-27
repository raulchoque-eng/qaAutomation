# Login feature review the behavior in thie feature
Feature: Employee



  Scenario: I should be able to create new employee on the emplooyee
    Given Ultimate QA page is loaded
    When I log on the application
    And I go to the All Person and employees tab
    And I go to the All create Employees tab
    And I go to the All Llenar campos employee Tab
        |nombre |pedro          |
        |apellido|campos       |
        |ci      |3334222      |
    #And I search a course with "C# For QA Automation Engineers with Selenium Webdriver"
    #Then I see the course "C# For QA Automation Engineers with Selenium Webdriver" in home page
