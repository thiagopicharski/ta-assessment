# encoding: utf-8
# Author
# Date
# Description
Feature: Feature to test login funcionality

  Background: User navigate to the login page
    Given the browser is opened
    And the user is in the home page
    When the user navigate to the login page

  @mustRun
  Scenario Outline: Check login is successful with valid credentials
    Given the user enters valid <username> and <password>
    And clicks on login button
    Then user is navigated to the logged home page

    Examples: 
      | username                | password |
      | testing_qa_@outlook.com | abc123d4 |
	
	@regression
  Scenario Outline: Check login is faild with invalid credentials
    Given the user enters invalid <username> and <password>
    And clicks on login button
    Then user is shown with the proper failure <message>

    Examples: 
      | username                | password | message                    |
      | testing_qa_@outlook.com | abc11111 | Usuário ou senha inválidos |
