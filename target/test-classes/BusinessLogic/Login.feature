Feature: Login Functionality

Background: Successfully clicked on Initial Login window
When user open "Chrome" browser with exe as "D:\\Automation Support\\chromedriver.exe"
When user open url as "https://www.flipkart.com/"
When user cancel initial Login window

Scenario: Login functionality by using valid credentials
When user navigate on Login button
When user clicked on My Profile
When user enter "7358348135" as username
When user enter "sagarpriya" as password
When user click on Login button
Then application shows user profile to user


