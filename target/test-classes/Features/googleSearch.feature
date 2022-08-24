Feature: feature to test google search functionality
  @smoke
  Scenario: Validate google search working
    Given browser is open
    And user is on google search page
    When user enters a text in search box
    And click button enter
    Then user is navigated to serach result
  