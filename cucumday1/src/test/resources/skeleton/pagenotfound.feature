Feature: pay without add to cart
Scenario: moves to cart without adding items
Given testme app "http://10.232.237.143:443/TestMeApp/fetchcat.htm"
When search headphone
And proceed to payment without adding to cart
Then testmeapp doesnot display cart icon