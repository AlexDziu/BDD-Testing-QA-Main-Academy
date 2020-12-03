Feature: Add products to Wish List

  Background: User is logged in
    Given I am on the demo.opencart.com main page
    When I enter 'sashagood12121986@gmail.com' and '1234' into login
    Then I see 'My Account' on the left top of the page

  Scenario: Add monitors to WishList
    Given I click on COMPONENTS in the top menu
    When I choose MONITORS
    And I add 'Apple Cinema 30"' and 'Samsung SyncMaster 941BW' to WishList
    And I navigate to WishList page
    Then I see 'Apple Cinema 30"' and 'Samsung SyncMaster 941BW' added
