Feature: To check and validate the functionality when user is created

   @negativeScenario1
   Scenario: Foreign Exchange Page failure
     Given API for foreign exchange one
      When posted with incorrect Information
      Then validate negative response code received
      