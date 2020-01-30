Feature:Login on TestMeApp
Scenario Outline: Login on TestMeapp and register with username
Given The URL of testmeapp is "http://10.232.237.143:443/TestMeApp/login.htm"
When user enters "<username>" as userName
And user enters "<password>" as Password
Then user clicks on "Login" Button
Examples:
|username|password|
|sravanthi1|123456|
