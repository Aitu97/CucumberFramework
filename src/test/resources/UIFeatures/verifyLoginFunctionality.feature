 @TEC-101 @regressionTest @ui @api
   Feature: Verifying  login Functionality

     Background: Common first steps
       Given Navigate to login page

     @smokeTest
     Scenario:  Verifying with valid credentials
       Then User logs in with valid credentials username "Tester" password "test"
       And Verify user is in Homepage

       Scenario: Verifying with invalid credentials
         Then User logs in with invalid credentials username "Testers" password "test"
         And Verify user gets error message "Invalid Login or Password."


