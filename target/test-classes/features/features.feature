Feature: task

  Background:
    Given homepage is open
    And I close the pop up

  Scenario: task1
    And title should be correct
    And search for "Drone"
    Then search result should be seen

  Scenario: task2
    And I open "Account" dropdown menu
    When I choose "Sign In"
    Then sign in page should be opened
    And I login with "<EMAIL>" and "<PASSWORD>"
    And I entered
    Then I see my account

  Scenario: task3
    And I open "Account" dropdown menu
    When I choose "Sign In"
    Then sign in page should be opened
    And sign in with Google
    And verify the login
    And open new tab

  Scenario: task4
    And I open hamburger menu
    And I select Audio
    And I select Headphones
    And I select Wireless Headphones
    And verify the wireless headphones title
    And scroll down
    And search brand for "Philips"










