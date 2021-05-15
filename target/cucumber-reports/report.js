$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/Register.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@ExamPortalRegistration"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Launch exam portal",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@RegisterHappyPath"
    }
  ]
});
formatter.step({
  "name": "User launches exam portal URL",
  "keyword": "Given "
});
formatter.step({
  "name": "User lands on home page",
  "keyword": "When "
});
formatter.step({
  "name": "User click on register button",
  "keyword": "Then "
});
formatter.step({
  "name": "User gets redirected to register page",
  "keyword": "Then "
});
formatter.step({
  "name": "User fills registration form with details",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "Username",
        "Password",
        "Firstname",
        "Lastname",
        "Email",
        "Phone"
      ]
    },
    {
      "cells": [
        "TestUser",
        "NewPassord01!",
        "Test",
        "User",
        "test@gmail.com",
        "9123548414"
      ]
    }
  ]
});
formatter.step({
  "name": "clicks on Register button",
  "keyword": "And "
});
formatter.step({
  "name": "Registeration gets successful and alerts is displayed with user ID",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "examportalurl"
      ]
    },
    {
      "cells": [
        "http://localhost:4200"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Launch exam portal",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ExamPortalRegistration"
    },
    {
      "name": "@RegisterHappyPath"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches exam portal URL",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonSteps.userLaunchesExamPortalURL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User lands on home page",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageStepDef.user_lands_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on register button",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDef.user_click_on_register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User gets redirected to register page",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationPageStepDef.user_gets_redirected_to_register_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User fills registration form with details",
  "rows": [
    {
      "cells": [
        "Username",
        "Password",
        "Firstname",
        "Lastname",
        "Email",
        "Phone"
      ]
    },
    {
      "cells": [
        "TestUser",
        "NewPassord01!",
        "Test",
        "User",
        "test@gmail.com",
        "9123548414"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationPageStepDef.user_fills_registration_form_with_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on Register button",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationPageStepDef.clicks_on_register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Registeration gets successful and alerts is displayed with user ID",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationPageStepDef.registeration_gets_successful_and_alerts_is_displayed_with_user_id()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});