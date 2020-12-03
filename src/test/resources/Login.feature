Feature: Login to demo.opencart.com

  Scenario: Login with valid account
    Given I am on the demo.opencart.com main page
    When I enter 'sashagood12121986@gmail.com' and '1234' into login
    Then I see 'My Account' on the left top of the page
