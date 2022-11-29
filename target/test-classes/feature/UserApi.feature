Feature: test get api

  Scenario: validate get user api
      When user enter the url
      Then verify status code is 200

  Scenario Outline: validate post user api
    When user enter the "<requestplayload>"
    Then verify status code is 200
    Examples:
      |requestplayload          |
      |testData/create_user.json|

