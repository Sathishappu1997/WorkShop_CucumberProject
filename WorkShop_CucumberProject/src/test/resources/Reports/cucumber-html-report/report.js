$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/TestCases_Config.feature");
formatter.feature({
  "name": "OrangeHRM Website",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@OrangeHRM"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Validate the login Functionality of OrangeHRM Page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Open browser and Go to Url",
  "keyword": "Given "
});
formatter.step({
  "name": "verify the title",
  "keyword": "When "
});
formatter.step({
  "name": "enter the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "click the submit button",
  "keyword": "Then "
});
formatter.step({
  "name": "Close the Browser",
  "keyword": "And "
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
        "admin",
        "Admin123"
      ]
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate the login Functionality of OrangeHRM Page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@OrangeHRM"
    }
  ]
});
formatter.step({
  "name": "Open browser and Go to Url",
  "keyword": "Given "
});
formatter.match({
  "location": "com.StepDefinition.OrangeHRM_Login_Steps.open_browser_and_Go_to_Url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the title",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.OrangeHRM_Login_Steps.verify_the_title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the \"admin\" and \"Admin123\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.OrangeHRM_Login_Steps.enter_the_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.OrangeHRM_Login_Steps.click_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the Browser",
  "keyword": "And "
});
formatter.match({
  "location": "com.StepDefinition.OrangeHRM_Login_Steps.close_the_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate the login Functionality of OrangeHRM Page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@OrangeHRM"
    }
  ]
});
formatter.step({
  "name": "Open browser and Go to Url",
  "keyword": "Given "
});
formatter.match({
  "location": "com.StepDefinition.OrangeHRM_Login_Steps.open_browser_and_Go_to_Url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the title",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.OrangeHRM_Login_Steps.verify_the_title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the \"Admin\" and \"admin123\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.OrangeHRM_Login_Steps.enter_the_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.OrangeHRM_Login_Steps.click_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the Browser",
  "keyword": "And "
});
formatter.match({
  "location": "com.StepDefinition.OrangeHRM_Login_Steps.close_the_Browser()"
});
formatter.result({
  "status": "passed"
});
});