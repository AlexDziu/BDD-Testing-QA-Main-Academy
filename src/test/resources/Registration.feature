Feature: Registration to demo.opencart.com

  Scenario: Check registration is successful
    Given I am on the demo.opencart.com register page
    When I fill out the form with valid values into register
    Then I see message 'Your Account Has Been Created!' appears