@Regression
Feature: Slingo


  Scenario: User should navigate to slingo page successfully
    When I click on accept Cookies
    Then I am on homepage
    And I click on slingo link
    Then I can verify the text "Enjoy the World of Slingo with Virgin Games"