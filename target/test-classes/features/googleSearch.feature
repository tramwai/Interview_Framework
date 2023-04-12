@Smoke
Feature: Google Search Page Feature
  Scenario: Validating the google search feature

    Given user navigates to "https://www.google.com/"
    And user enters "Tesla" into the search box
    When user presses Search button
    Then user should see "Tesla" in the URL
    And user should see "Tesla" in the title



