Feature: PUT UpdateData Users API Automation Testing

  Scenario: Put update data users with valid json
      Given Put update data request body users id with valid json
      When Send put update data users
      Then Response status code should be 200 Oke
      And Validate put update data users resource json schema


  Scenario: PUT update with invalid JSON Request
    Given PUT update data users with invalid JSON Request
    When Send put update data users
    Then Response status code should be 422 Unprocessable Content
    And Validate invalid put update data users resource json schema


  Scenario: Update with json JSON Request name is blank
    Given Put Update users with json JSON Request name is blank
    When Send put update data users
    Then Response status code should be 422 Unprocessable Content
    And Validate invalid put update data users resource json schema


  Scenario: Update with JSON Request email is blank
    Given PUT update data users with JSON Request email is blank
    When Send put update data users
    Then Response status code should be 422 Unprocessable Content
    And Validate invalid put update data users resource json schema


  Scenario: Update with JSON Request gender is blank
    Given PUT update data users with JSON Request gender is blank
    When Send put update data users
    Then Response status code should be 422 Unprocessable Content
    And Validate invalid put update data users resource json schema


  Scenario: Update with JSON Request status is blank
    Given PUT update data users with JSON Request status is blank
    When Send put update data users
    Then Response status code should be 422 Unprocessable Content
    And Validate invalid put update data users resource json schema


  Scenario: Update with JSON Request name and email is blank
    Given PUT update data users with JSON Request name and email is blank
    When Send put update data users
    Then Response status code should be 422 Unprocessable Content
    And Validate invalid put update data users resource json schema


  Scenario: Update with JSON Request name and gender is blank
    Given PUT update data users with JSON Request name and gender is blank
    When Send put update data users
    Then Response status code should be 422 Unprocessable Content
    And Validate invalid put update data users resource json schema


  Scenario: Update with JSON Request name and status is blank
    Given PUT update data users with JSON Request name and status is blank
    When Send put update data users
    Then Response status code should be 422 Unprocessable Content
    And Validate invalid put update data users resource json schema


  Scenario: Update with JSON Request email and gender is blank
    Given PUT update data users with JSON Request email and gender is blank
    When Send put update data users
    Then Response status code should be 422 Unprocessable Content
    And Validate invalid put update data users resource json schema


  Scenario: Update with JSON Request email and status is blank
    Given PUT update data users with JSON Request email and status is blank
    When Send put update data users
    Then Response status code should be 422 Unprocessable Content
    And Validate invalid put update data users resource json schema