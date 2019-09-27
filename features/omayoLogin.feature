Feature: Login features of Omayo Application

@All @ignore @omayoLogin
Scenario Outline: User is able to login with valid credential only
Given I navigate to Omayo website
When I enter username as "<username>" and password as "<password>" in the fields
And I click on Login button
Then User should login based on expected <loginStatus> value

Examples:
|username				|password	|loginStatus|
|arun    				|pswd1    |failure   	|
|SeleniumByArun	|Test143$	|success		|
|motoori				|pswd2		|failure 		|

