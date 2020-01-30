Feature:Register on TestMeApp
Scenario:Click on SignUp and register on TestMeApp
Given The URL of TestMeApp "http://10.232.237.143:443/TestMeApp/RegisterUser.htm"
When User enters "sravanthi" as user_name
And User enters "sai" as firstname
And user enters "datla" as lastname
And user enters "123456" as password
And user enters "123456" as confirmpassword
And user selects "female" as gender
And user enters "sra@gmail.com" as email
And user enters "6476763492" as mobilenumber
And user enters "11/11/1997" as DOB
And user enters "visakhapatnam" as address
And user selects "What is your birth place?" as SecurityQuestion
And user enters "vizag" as answer
Then user clicks on "Register" button
