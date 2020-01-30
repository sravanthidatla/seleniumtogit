$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/skeleton/demowebshop.feature");
formatter.feature({
  "name": "Demo Web Shop Login Feature file",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Valid Login For Demo Web Shop",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The URL of the Demo Web Shop \"http://demowebshop.tricentis.com/login\"",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters \"\u003cusername\u003e\" as username",
  "keyword": "When "
});
formatter.step({
  "name": "User enters \"\u003cpassword\u003e\" as password",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "name": "User is in a valid page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "askmail@gmail.com",
        "abc123"
      ]
    },
    {
      "cells": [
        "askmail@email.com",
        "abc123"
      ]
    },
    {
      "cells": [
        "askmail@ymail.com",
        "abc123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Valid Login For Demo Web Shop",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The URL of the Demo Web Shop \"http://demowebshop.tricentis.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "skeleton.demowebpage.the_URL_of_the_Demo_Web_Shop(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"askmail@gmail.com\" as username",
  "keyword": "When "
});
formatter.match({
  "location": "skeleton.demowebpage.user_enters_as_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"abc123\" as password",
  "keyword": "And "
});
formatter.match({
  "location": "skeleton.demowebpage.user_enters_as_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "skeleton.demowebpage.user_clicks_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is in a valid page",
  "keyword": "Then "
});
formatter.match({
  "location": "skeleton.demowebpage.user_is_in_a_valid_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Valid Login For Demo Web Shop",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The URL of the Demo Web Shop \"http://demowebshop.tricentis.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "skeleton.demowebpage.the_URL_of_the_Demo_Web_Shop(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"askmail@email.com\" as username",
  "keyword": "When "
});
formatter.match({
  "location": "skeleton.demowebpage.user_enters_as_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"abc123\" as password",
  "keyword": "And "
});
formatter.match({
  "location": "skeleton.demowebpage.user_enters_as_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "skeleton.demowebpage.user_clicks_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is in a valid page",
  "keyword": "Then "
});
formatter.match({
  "location": "skeleton.demowebpage.user_is_in_a_valid_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Valid Login For Demo Web Shop",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The URL of the Demo Web Shop \"http://demowebshop.tricentis.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "skeleton.demowebpage.the_URL_of_the_Demo_Web_Shop(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"askmail@ymail.com\" as username",
  "keyword": "When "
});
formatter.match({
  "location": "skeleton.demowebpage.user_enters_as_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"abc123\" as password",
  "keyword": "And "
});
formatter.match({
  "location": "skeleton.demowebpage.user_enters_as_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "skeleton.demowebpage.user_clicks_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is in a valid page",
  "keyword": "Then "
});
formatter.match({
  "location": "skeleton.demowebpage.user_is_in_a_valid_page()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/skeleton/shout.feature");
formatter.feature({
  "name": "Shout Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Persons are within the range",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@valid"
    }
  ]
});
formatter.step({
  "name": "Sean is 10 meters away from Lucia",
  "keyword": "Given "
});
formatter.match({
  "location": "skeleton.stepdefinitions.sean_is_meters_away_from_Lucia(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Sean shouts \"Free Coffee\"",
  "keyword": "When "
});
formatter.match({
  "location": "skeleton.stepdefinitions.sean_shouts(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Lucia hears the message \"Free Coffee\"",
  "keyword": "Then "
});
formatter.match({
  "location": "skeleton.stepdefinitions.lucia_hears_the_message(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});