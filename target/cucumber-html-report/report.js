$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/LetsGoShopping.feature");
formatter.feature({
  "line": 1,
  "name": "Let\u0027s go Shopping",
  "description": "",
  "id": "let\u0027s-go-shopping",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7530954200,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Shop for a T-Shirt",
  "description": "",
  "id": "let\u0027s-go-shopping;shop-for-a-t-shirt",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is logged on to \u0027Your Logo\u0027 website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the user searches for \u0027Faded Short Sleeve T-shirts\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "selects \u0027Faded Short Sleeve T-shirts\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "completes the payment process",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the order is generated with a valid order id",
  "keyword": "Then "
});
formatter.match({
  "location": "LetsGoShopping.user_is_logged_on_to_Your_Logo_website()"
});
formatter.result({
  "duration": 13263611445,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Faded Short Sleeve T-shirts",
      "offset": 23
    }
  ],
  "location": "LetsGoShopping.the_user_searches_for_a_product(String)"
});
formatter.result({
  "duration": 1863424324,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Faded Short Sleeve T-shirts",
      "offset": 9
    }
  ],
  "location": "LetsGoShopping.selects_a_Product_Based_On_Description(String)"
});
formatter.result({
  "duration": 2830881167,
  "status": "passed"
});
formatter.match({
  "location": "LetsGoShopping.completes_the_payment_process()"
});
formatter.result({
  "duration": 3800079068,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 29148,
  "status": "passed"
});
});