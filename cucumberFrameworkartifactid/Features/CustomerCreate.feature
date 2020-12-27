Feature: Customer Creation

 Background: 
 Given user launch chrome browser
When user opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F "
And user enters Email as "admin@yourstore.com" and password as "admin"
And Click on Login
Then User can view the Dashboard

@sanity
Scenario: Add new customer
When user click on customer menu
And click on customer menu item
And click on add new button
Then user can view add new customer page
When user enters customer info
And click on save button
Then user can view confirmation message "The new customer has been added successfully."
And Close Browser

@regression
Scenario: Search Customer by EmailID
Given user launch chrome browser
When user opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F "
And user enters Email as "admin@yourstore.com" and password as "admin"
And Click on Login
Then User can view the Dashboard
When user click on customer menu
And click on customer menu item
And Enter customer Email
When Click on search button
Then User should find Email in the Search table
And Close Browser

