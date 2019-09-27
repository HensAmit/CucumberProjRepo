Feature: Searching of various categories should be possible along with product search in Amazon

It is good to provide an option to our end users where they can search for the products
based on their category, rather than only searching a product.This will increase our 
business and make end users happy.

@SmokeTest @All @dev
Scenario: Search for products under Books category
Given I visit the website as Guest user
When I select Books option from dropdown
And I click on Search icon
Then I should see books page loaded
And I should see Books at Amazon as heading
But I should not see other category products

@All @wip
Scenario: Search for the products under Baby category
Given I visit the website as Guest user
When I select Baby option from dropdown
And I click on Search icon
Then I should see Baby page loaded
And I should see The baby store as heading
But I should not see other category products
