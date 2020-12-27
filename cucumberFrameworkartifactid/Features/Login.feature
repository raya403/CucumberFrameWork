Feature: Login
Scenario: Able to login successfully with valid credentials

Given user launch chrome browser
When user opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F "
And user enters Email as "admin@yourstore.com" and password as "admin"
And Click on Login
Then Page Title should be "Dashboard / nopCommerce administration"
When user clicks on Logout Link
And Close Browser

Scenario Outline: Login DataDriven
Given user launch chrome browser
When user opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F "
And user enters Email as "<email>" and password as "<password>"
And Click on Login
Then Page Title should be "Dashboard / nopCommerce administration"
When user clicks on Logout Link
And Close Browser

Examples: 
		| email | password |
		| admin@yourstore.com |admin |
	    | admin1@yourstore.com | admin1 |