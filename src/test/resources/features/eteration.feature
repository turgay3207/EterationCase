@eteration
Feature: Instructor List Verification

  Background: User goes to Url
    Given User open the Eteration Academy homepage "https://academy.eteration.com/"

  Scenario: Verify the instructor list is not empty and contains 8 instructors
    When User click on the "Instructors" link
    Then User should see the instructor list with exactly "6" instructors
