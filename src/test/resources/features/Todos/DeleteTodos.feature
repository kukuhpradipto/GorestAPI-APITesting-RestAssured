Feature: Todos Delete Id API Automation Testing

  Scenario: Delete user with valid parameter
    Given Delete user with valid parameter id 199
    When Send request delete user
    Then Status code should be 200 OKE
