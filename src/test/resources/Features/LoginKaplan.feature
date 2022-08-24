Feature: Login

As a user I want to login Codekaplan application

 @smoke
 Scenario Outline:Sample 1 Check login is successful with valid credentials
    Given user is on CodeKaplan login page
    When user enters <username> and <password>
    And clicks on login button
    Then user succsessfully login and see information

    Examples: 
      | username                     | password |
      | nasiba_usmanova@yahoo.com    | Plainfield2022   |
      
  @regression
 Scenario Outline: Sample 2 Check login is successful with valid username and incorrect password
    Given user is on CodeKaplan login page
    When user enters <username> and <password>
    And clicks on login button
    Then user succsessfully login and see information

    Examples: 
      | username                     | password |
      | nasiba_usmanova@yahoo.com    | Plainfield2022$   |