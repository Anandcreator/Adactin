Feature: Hotel Booking in Adactin Application
Scenario: User Login In The Web Application
Given user Launch The Adactin Application 
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Click The Login Button And It Navigates To Search Hotel page

Scenario: User Entering The Details In the Search Hotel Page
When user Select the location indropdown menu
And user Select the hotel in Hotels dropdown menu
And user Select the Room Type in Room Type Menu
And user Select the Number of rooms in number of rooms menu
And user Enter the Check in Date in check in date menu
And user Enter the checkout date in check out date menu
And user Select how many adults in  Adults per room Drop down menu
And user Select how many Children in Children per room Drop down menu
Then user Click the search button and it navigates to select hotel page

Scenario: User Entering The Select Hotel Page and select the Hotel in That List
When user Select the Radiobutton HotelSunshine from the list of Hotels
And user Click the Continue Button and it navigates to Book A Hotel Page 

Scenario: User Entering The Details in the Book A hotel Page Details
When user Enter a Name in a First Name Tab
And user Enter a Last Name in a Last Name Tab
And user Enter a Address in a Billing address Tab
And user Enter a Card Number in a Card Number Tab
And User Select the Card Type in the Credit Card Type Dropdown
And User Select the Month in a Select Down DRop Down in Expiry Date Tab
And user Select the Year in a Select Year Drop Down Menu in Expiry Date Tab
And user Enter the CVV Number in a CVV number Dropdown
And user click in the Book now Button it Navigates to Booking Confirmation Page

Scenario: User Reverify the Details and Logout
When User Click the LogOut Button and it navigates to Home Page