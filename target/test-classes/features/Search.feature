Feature: Search


  Scenario: Search for codecontrol

    Given A user navigates to google
    When a user searches for "codecontrol"
    Then "CodeControl - Richard Hendricksen" is the first in the results
