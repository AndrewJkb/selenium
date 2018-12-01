
@tag
Feature: Flight reservation
  I want to login and reserve some flights

  @tag1
  Scenario: login to the app
    Given I open main page
    When I fill the login from login "Tester129" and Pass "qwerty123"
    Then I should see the flight reservacion
    
  Scenario: simple reservation process
    Given I open reservation page
    When I fill all the reservation form
    Then I should filled all the pools and logout