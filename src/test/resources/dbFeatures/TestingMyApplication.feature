Feature: Testing my application

  @db @TECTC-108
  Scenario Outline: Validating ui data with Database
    Given Navigate to MyApplication
    When User gets employee info for employee_id "<Employee_id>" data from UI
    And User gets data for employee_id "<Employee_id>" from database
    Then Validate data is matching
    Examples:
    |Employee_id|
    |100        |
    |105        |
    |119        |
    |125        |
    |150        |
    |170        |
    |-125       |