@Facebook
Feature: Facebook Authentication

  @Recover_Account
  Scenario Outline: Recover account
  #  Will leave this as a 1 step
    Then I can recover my username using my registered "<phone number>" and "<full name>"

    Examples:
      |phone number   |full name          |
      |+5541988966810 |Marcos Ghiraldelli |
      |+5541000000000 |Marcos Ghiraldelli |

  @Reset_Forgotten_Password
  # Facebook seems to require me to try an invalid password in the first place
  Scenario Outline: Reset password if forgotten
    Given I can log in into the application by entering a registered "<email/username>" and "<password>"
    But I have forgotten my password
    Then I can reset my password using my "<phone>"
    Examples:
      |email/username               |password       |phone       |
      |marcos.ghiraldelli@yawho.com |***************|+5541988966810|
      |marcos.ghiraldelli@yawho.com |***************|+5541000000000|
#      |invalid_email@yawho.com      |***************|+5541000000000|

  @Reset_Known_Password
  Scenario Outline: Reset password
    Given I can log in into the application by entering a registered "<email/username>" and "<password>"
    And I can reset my own password to "<new password>" from "<password>"
    Examples:
      |email/username               |password       |new password |
      |marcos.ghiraldelli@yahoo.com |Y3R_ctCLV,+Jp7m|PASSWORD     |