$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("slingo.feature");
formatter.feature({
  "line": 2,
  "name": "Slingo",
  "description": "",
  "id": "slingo",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 7038444700,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should navigate to slingo page successfully",
  "description": "",
  "id": "slingo;user-should-navigate-to-slingo-page-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I click on accept Cookies",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I am on homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I click on slingo link",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I can verify the text \"Enjoy the World of Slingo with Virgin Games\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SlingoSteps.iClickOnAcceptCookies()"
});
formatter.result({
  "duration": 340813600,
  "status": "passed"
});
formatter.match({
  "location": "SlingoSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 23200,
  "status": "passed"
});
formatter.match({
  "location": "SlingoSteps.iClickOnSlingoLink()"
});
formatter.result({
  "duration": 535742600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Enjoy the World of Slingo with Virgin Games",
      "offset": 23
    }
  ],
  "location": "SlingoSteps.iCanVerifyTheText(String)"
});
formatter.result({
  "duration": 451084600,
  "status": "passed"
});
formatter.after({
  "duration": 932040300,
  "status": "passed"
});
});