@OrangeHRM
Feature: OrangeHRM Website

Scenario Outline: Validate the login Functionality of OrangeHRM Page
Given Open browser and Go to Url
When verify the title
Then enter the "<username>" and "<password>"
Then click the submit button
And Close the Browser

Examples:

|username|password|
|admin|Admin123|
|Admin|admin123|