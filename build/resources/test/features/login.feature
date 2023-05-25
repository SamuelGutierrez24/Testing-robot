#AUTHOR Samuel Gutierrez

  @HistoriaDeUsuario
  Feature: Verify the validation form
    Me as a user WANT to enter the colorlib page TO verify the validation form

  Scenario Outline: Verify the validation form
    Given I enter with my credentials
    |User|Password|
    |<User>|<Password>|
    When  I preceed with the authentication
    And enter submenu form validations
    And check the title of the form on the screen
    And fill all fields
      |Required|Select|MultipleSelect|Url|Email|Password|ConfirmPassword|MinField|MaxField|NumField|Ip|Date|DateEarlier|
      |<Required>|<Select>|<MultipleSelect>|<Url>|<Email>|<Password>|<ConfirmPassword>|<MinField>|<MaxField>|<NumField>|<Ip>|<Date>|<DateEarlier>|
    And click button validate
    Then required will be empty

    Examples:
      |User|Password|Required|Select|MultipleSelect|Url|Email|Password|ConfirmPassword|MinField|MaxField|NumField|Ip|Date|DateEarlier|
      |admin|admin|prueba |option2|option3 |http://dfsdfd.com|a@q.com|123|123 |1|null|3166983864|192.144.066|2013/06/24|2011/07/28|
