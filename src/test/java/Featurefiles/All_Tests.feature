Feature: Plan a Journey widget

  Background:

    Given User is on the Plan a Journey page

  Scenario: Test 1:Validating valid journey using the widget

    When User enter From "Barking" and To "Westminster"
    And Click on the Plan my journey button
    Then User is on the Journey results page

  Scenario: Test 2:Validating invalid journey using the widget

    When User enter From "Invalid" and To "Invalid"
    And Click on the Plan my journey button
    Then User is on the Journey results page

  Scenario: Test 3:Validating empty fields on the Widget

    When Click on the Plan my journey button
    Then Error message should be shown on both fields

  Scenario: Test 4:Editing the Journey details

    And User enter From "Barking" and To "Westminster"
    And Click on the Plan my journey button
    When Click on the Edit journey button and update From "NewBury" field
    And Click on the Update Journey button
    Then Journey details updated

  Scenario: Test 5:Verify that the “Recents” tab on the widget

    And User enter From "Barking" and To "Westminster"
    And Click on the Plan my journey button
    And Go back to home page
    And click on Recent Section
    Then Recent list should be shown

