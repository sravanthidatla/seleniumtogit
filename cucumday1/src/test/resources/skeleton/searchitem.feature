Feature:Login on TestMeApp

Scenario Outline: Login on TestMeapp and register with username
Given The URL of Testmeapp "http://10.232.237.143:443/TestMeApp/login.htm"
When user enters "<username>" as user_Name
And user enters "<password>" as Pass_word
Then user clicks on "Login" BuTTon
Examples:
|username|password|
|sravanthi1|123456|

Scenario:Search headphones in search tab
Given The URL of Testmeapp "http://10.232.237.143:443/TestMeApp/fetchcat.htm"
When user searches for the product
And user clicks on the product
Then user clicks on addtocart 