$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/Search.feature");
formatter.feature({
  "name": "Search",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search for codecontrol",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "A user navigates to google",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefs.aUserNavigatesToGoogle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a user searches for \"codecontrol\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefs.aUserSearchesFor(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"CodeControl - Richard Hendricksen\" is the first in the results",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs.isTheFirstInTheResults(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});