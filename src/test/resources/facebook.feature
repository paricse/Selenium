@TaggedHooks
Feature: to validate login functionality of facebook application

Background:
Given To launch the chrome browser and maximize the window


@smoke 
Scenario: To validate login with valid username and valid password
When To launch the url of the facebook application
And To pass  valid username in email field
And To pass  valid password in password field
And To click  login button
And To check whether navigate to the homepage or not
Then To close the browser



@sanity
Scenario Outline: To validate positive and negative combination of login functionality
When User has to launch the url of facebook application
And User has to pass username "<emaildatas>"in email field
And User has to pass password "<passworddatas>"in password field
And User has to click login button
And User has to check whether navigate to the homepage or not
Then User has to close the browser

Examples:
|emaildatas|passworddatas|
|abc11@gamil.com|abc11| 
|banu12@gmail.com|banu|
