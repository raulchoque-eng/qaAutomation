# Login feature review the behavior in thie feature
Feature: Login

  Scenario: I should be able to log on the application
    Given Ultimate QA page is loaded
    When I log on the application
    And I go to the All Courses Tab
    And I search a course with "C# For QA Automation Engineers with Selenium Webdriver"
    Then I see the course "C# For QA Automation Engineers with Selenium Webdriver" in home page
