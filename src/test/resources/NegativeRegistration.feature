Feature: Negative registration to demo.opencart.com

  Scenario: Registration without credentials
    Given I am on the demo.opencart.com register page
    When I fill out without valid values into register
    Then I see that message 'First Name must be between 1 and 32 characters!' appears