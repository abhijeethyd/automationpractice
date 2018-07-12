Feature: Let's go Shopping

Scenario: Shop for a T-Shirt

Given user is logged on to 'Your Logo' website
When the user searches for 'Faded Short Sleeve T-shirts'
And selects 'Faded Short Sleeve T-shirts'
And completes the payment process  
Then the order is generated with a valid order id