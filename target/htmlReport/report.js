$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("register.feature");
formatter.feature({
  "line": 1,
  "name": "Registration Tests",
  "description": "",
  "id": "registration-tests",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Register an account with valid details",
  "description": "",
  "id": "registration-tests;register-an-account-with-valid-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Register"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User navigates to Registration page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User provies the following details into the input fields",
  "rows": [
    {
      "cells": [
        "firstName",
        "amit"
      ],
      "line": 7
    },
    {
      "cells": [
        "lastName",
        "kumar"
      ],
      "line": 8
    },
    {
      "cells": [
        "email",
        "qwert@yahoo.co.in"
      ],
      "line": 9
    },
    {
      "cells": [
        "phone",
        "12345678"
      ],
      "line": 10
    },
    {
      "cells": [
        "password",
        "SeleniumTester$"
      ],
      "line": 11
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Selects the privacy policy option",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Clicks on Continue button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User should get successfully registered",
  "keyword": "Then "
});
formatter.match({
  "location": "Register.navigate()"
});
formatter.result({
  "duration": 21983092000,
  "status": "passed"
});
formatter.match({
  "location": "Register.user_provies_the_following_details_into_the_input_fields(DataTable)"
});
formatter.result({
  "duration": 1207481100,
  "status": "passed"
});
formatter.match({
  "location": "Register.selects_the_privacy_policy_option()"
});
formatter.result({
  "duration": 91278200,
  "status": "passed"
});
formatter.match({
  "location": "Register.clicks_on_Continue_button()"
});
formatter.result({
  "duration": 969926600,
  "status": "passed"
});
formatter.match({
  "location": "Register.user_should_get_successfully_registered()"
});
formatter.result({
  "duration": 23588300,
  "status": "passed"
});
});