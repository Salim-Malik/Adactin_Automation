Feature: Booking Hotel In Adactin Application

@smokeTest
Scenario Outline: user Login In the Login Page

Given user Launch The Application
When user Enter The "<Username>" In Username Field
And user Enter The "<Password>" In Password Field
Then user Click On The Login Button And It Navigates To The SearchHotelPage

Examples:

  |Username|Password|
  |ABC|123|
  |Sammak64|Selenium|

Scenario: user Select The Hotel In SearchHotelPage

When user Select The Location In Location Dropdown
And user Select The Hotel In Hotels Dropdown
And user Select The Room Type In Room Type Dropdown
And user Type The Check Out Date
Then user Click On The Search Button And It Navigates To The Select HotelPage

Scenario: user Confirm The Hotel In Select HotelPage

When user Click The Radio Button
Then user Click On The Search Button And It Navigates To The Book HotelPage

Scenario: user Book The Hotel In Book HotelPage

When user Type The First Name In First Name Field
And user Type The Second Name In Second Name Field
And user Type The Address In Address Field
And user Type The Credit Card Number In Credit Card Number Field
And user Type The First Name In First Name Field
And user Select The Credit Card Type In CRedit Card Type Dropdown
And user Select The Month In Expiry Date Dropdown
And user Select The Year In Expiry Year Dropdown
And user Type The Cvv Number In Cvv Number Field
Then user Click On The Book Now Button And It Navigates To The Book Confirmation Page

Scenario: user Verified The Booking Confirmation

Then user Click the My Itinerary And It Navigates To The Booked Itinerary

Scenario: user Confirm The Hotel Room Booking And Logout

Then user Click the Logout Button And It Navigates To The Logged Out Successfully
 