Feature: Hotel Booking In Adactin Application
@smoke
Scenario Outline: User Login In the Web Application
Given user Launch the adactin Application
When user Enter the "<username>" in Username Field
And user Enter the "<password>" in Password Field
Then user click The Login Button And Navigate to Search Hotel Page
Examples:
|username|password|
|QWSASW|THSHks|
|jhsjksc|hsjd|
|mohamedthalha|1497H6|
@Sanity
Scenario: User Search Hotel in the Adactin Website
When user search the Location For Hotel
And user Select the Hotel
And user Select the Room Type
And user Select the total no of rooms
And user Select the Check-in Date in Hotel
And user Select the Check-out Date in Hotel
And user Enter the Adult Person in per room
And user Enter the Child in per room
Then user Click the Search Button And it Navigate to Hotels Pages
@Sanity
Scenario: User want to Select Hotel in the adactin website
When user select the Hotel
Then user Click the Continue Button And Navigate to Payment Page
@Regression
Scenario: User Will Book A Hotel in Adactin Website
When user Enter the First name in Firstname Field
And user Enter The Lastname in Lastname Field
And user Enter the Billing Address in Billing Address Field
And user Enter the Credit Cardno in Credit Cardno Field
And user Enter the Credit cardType in Credit CardType Field
And user Enter the Expirydate of Card in Expiry Date Field
And User Enter the Cvvno in the Cvv Field
Then user Click the BookNow Button and it navigate to Booking Confirmation Page
@unit
Scenario: User Booked A Hotel in Adactin website
Then user Click the Logout Button in the Adactin Website