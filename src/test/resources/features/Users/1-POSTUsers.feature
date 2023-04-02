Feature: POST Create Data Users API Automation Testing

  Scenario: Create create new data with valid json
    Given Create new data users with valid json request body
    When Send post for create new data users
    Then Status code should be 201 Created
    And Validate post create new data resources json schema


  Scenario: Create users with invalid JSON Request
    Given Create users with invalid JSON Request
    When Send post for create new data users
    Then Response status code should be 422 Unprocessable Content
    And Validate post invalid create new users json schema


  Scenario: Create users with JSON Request name is blank
    Given Create users with json JSON Request name is blank
    When Send post for create new data users
    Then Response status code should be 422 Unprocessable Content
    And Validate post invalid create new users json schema


  Scenario: Create users with JSON Request email is blank
    Given Create users with JSON Request email is blank
    When Send post for create new data users
    Then Response status code should be 422 Unprocessable Content
    And Validate post invalid create new users json schema


  Scenario: Create users with JSON Request gender is blank
    Given Create users with JSON Request gender is blank
    When Send post for create new data users
    Then Response status code should be 422 Unprocessable Content
    And Validate post invalid create new users json schema


  Scenario: Create users with JSON Request status is blank
    Given Create users with JSON Request status is blank
    When Send post for create new data users
    Then Response status code should be 422 Unprocessable Content
    And Validate post invalid create new users json schema


  Scenario: Create users with JSON Request name and email is blank
    Given Create users with JSON Request name and email is blank
    When Send post for create new data users
    Then Response status code should be 422 Unprocessable Content
    And Validate post invalid create new users json schema


  Scenario: Create users with JSON Request name and gender is blank
    Given Create users with JSON Request name and gender is blank
    When Send post for create new data users
    Then Response status code should be 422 Unprocessable Content
    And Validate post invalid create new users json schema


  Scenario: Create users with JSON Request name and status is blank
    Given Create users with JSON Request name and status is blank
    When Send post for create new data users
    Then Response status code should be 422 Unprocessable Content
    And Validate post invalid create new users json schema


  Scenario: Create users with JSON Request email and gender is blank
    Given Create users with JSON Request email and gender is blank
    When Send post for create new data users
    Then Response status code should be 422 Unprocessable Content
    And Validate post invalid create new users json schema


  Scenario: Create users with JSON Request email and status is blank
    Given Create users with JSON Request email and status is blank
    When Send post for create new data users
    Then Response status code should be 422 Unprocessable Content
    And Validate post invalid create new users json schema
