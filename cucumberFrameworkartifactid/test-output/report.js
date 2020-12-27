$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CustomerCreate.feature");
formatter.feature({
  "line": 1,
  "name": "Customer Creation",
  "description": "",
  "id": "customer-creation",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6419732100,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user launch chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user opens URL \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F \"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters Email as \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click on Login",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User can view the Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_launch_chrome_browser()"
});
formatter.result({
  "duration": 263627300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F ",
      "offset": 16
    }
  ],
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "duration": 4854910100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 22
    },
    {
      "val": "admin",
      "offset": 60
    }
  ],
  "location": "Steps.user_enters_Email_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 436716700,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "duration": 8735880100,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_can_view_the_Dashboard()"
});
formatter.result({
  "duration": 18966700,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Search Customer by EmailID",
  "description": "",
  "id": "customer-creation;search-customer-by-emailid",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "user launch chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "user opens URL \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F \"",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "user enters Email as \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Click on Login",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User can view the Dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "user click on customer menu",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "click on customer menu item",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Enter customer Email",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Click on search button",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "User should find Email in the Search table",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "Close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_launch_chrome_browser()"
});
formatter.result({
  "duration": 586900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F ",
      "offset": 16
    }
  ],
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "duration": 781254400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 22
    },
    {
      "val": "admin",
      "offset": 60
    }
  ],
  "location": "Steps.user_enters_Email_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 514626100,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "duration": 5897911200,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_can_view_the_Dashboard()"
});
formatter.result({
  "duration": 15655900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_click_on_customer_menu()"
});
formatter.result({
  "duration": 3173027800,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_customer_menu_item()"
});
formatter.result({
  "duration": 3760109700,
  "status": "passed"
});
formatter.match({
  "location": "Steps.enter_customer_Email()"
});
formatter.result({
  "duration": 514261200,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_search_button()"
});
formatter.result({
  "duration": 3254007300,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_should_find_Email_in_the_Search_table()"
});
formatter.result({
  "duration": 158053100,
  "status": "passed"
});
formatter.match({
  "location": "Steps.close_Browser()"
});
formatter.result({
  "duration": 861520500,
  "status": "passed"
});
});