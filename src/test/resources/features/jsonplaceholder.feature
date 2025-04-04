@api
Feature:JsonPlaceholder API Testing

  Scenario Outline: User POST API testing
    Given  User sends a POST request with "<userId>" "<title>" "<body>"
    Then User verifies that status code is "<statusCode>"
    Then User verifies that userId is "<userId>"
    Then User verifies that title is "<title>"
    Then User verifies that body is "<body>"
    Examples:
      | userId | title        | body        | statusCode |
      | 1001   | Deneme title | Deneme body | 201        |