Feature: Login to Amazon India
@Test
Scenario Outline: Login to Amazon homepage
Given open "<browser>" browser
And navigate to "<website>" website
And verify pagetitle
When user enters "<username>" and "<password>" and clicks on login button
Then verify if the user is logged in

Examples:
|browser | website                  | username       | password|
|chrome  | https://www.facebook.com | test@gmail.com | password|