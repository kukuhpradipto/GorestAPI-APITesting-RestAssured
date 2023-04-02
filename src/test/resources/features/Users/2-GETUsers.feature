Feature: Get Data Users API Automation Testing

 Scenario: Get list user for appear all data
    Given Get list users data
    When Send request get list users
    Then Response status code should be 200 Oke
    And Validate get all users json schema


  Scenario: Get users with id
    Given Get user with valid id parameter
    When Send request get user with id
    Then Response status code should be 200 Oke
    And Validate get users json schema wit valid parameter


  Scenario: Get users with id unregister
    Given Get users with unregister id
    When Send request get user with id
    Then Response status code should be 404 Not Found
    And Validate get users with invalid id json schema


  Scenario: Get users with id alphabet
    Given Get users with invalid id is alphabet
    When Send get users with invalid id
    Then Response status code should be 404 Not Found
    And Validate get users with invalid id json schema


  Scenario: Get users with id character
    Given Get users with invalid id is special character
    When Send get users with invalid id
    Then Response status code should be 404 Bad Request
    And Validate get users with invalid id json schema
