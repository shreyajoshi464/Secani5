Feature: Negative Scenario Assertion

  Scenario: Validate Response status code using assertion
    Given API for foreign exchange;
    When posted with correct information;
    Then validate positive response object;
