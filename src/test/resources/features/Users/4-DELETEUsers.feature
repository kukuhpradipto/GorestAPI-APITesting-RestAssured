Feature: User Get Id API Automation Testing

  Scenario: Delete data users with valid id
    Given Delete data users with valid id
    When Send delete data users
    Then Response status code should be 204 No Content


  Scenario: Delete with unregister id
    Given Delete users with unregister id
    When Send delete data users
    Then Response status code should be 404 Not Found
    And Validate delete invalid users json schema


  Scenario: Delete with id alphabet
    Given Delete users with invalid id is alphabet
    When Send delete data users
    Then Response status code should be 404 Not Found
    And Validate delete invalid users json schema


  Scenario: Delete with id special character
    Given Delete users with invalid id is special character
    When Send delete data users
    Then Response status code should be 404 Not Found
    And Validate delete invalid users json schema