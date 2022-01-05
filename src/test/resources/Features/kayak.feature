Feature: Kayak Project

  Background:
    Given user is on the kayak home page

  Scenario:Validating the Flights page
    When user clicks on flights tab
    Then user should see title "Book the right flight with our no change fees filter."

  Scenario: Validating the Stays page
    When user clicks on the stays tab
    Then user will see title "Find the right hotel, vacation home, treehouse and more."

  Scenario: Validating the Cars page
    When user clicks on cars tab
    Then user should see the title "Compare rental car deals to find the right one."


  Scenario: validating Things to do page
    When user click on things to do tab
    Then user will be able to see "Find the best things to do for your trip."

  Scenario: validating the packages page
    When user clicks on packages tab
    Then the user should see title "Compare deals to find the right package."

  Scenario: validating the trains page
    When user clicks on the trains tab
    Then the user will see the title "Compare train deals to find the right one."

  Scenario: validating the cruise page
    When user clicks on the cruises tab
    Then user should see the header "Find Cruise Deals"

  Scenario: validating the explore page
    When user clicks on the explore tab
    Then the user should see header "Explore destinations"

  Scenario: validating the deals page
    When user clicks on the deal tab
    Then user should see header "Just need a quick escape?"

  Scenario: validating flight tracker page
    When user clicks on flight tracker tab
    Then user should see flight tracker page

#  Scenario: search a one-way flight from JFK to MIA
#    When user navigates to flight page and upon entering data clicks on search button
#      | tripType | from | to  | date |
#      | One-way  | JFK  | MIA | 1/28 |
#    Then user should see the search results

#  Scenario: search a round trip train from Penn Station to Trenton,NJ
#    When user navigates to the train page and upon entering data clicks on the search button
#      | From     | To      | TravelDate | ReturnDate |
#      | New York | Trenton | 1/25       | 2/4        |
#    Then the user should see the searched trains

#  Scenario: Tracking a JetBlue flight
#    When user navigates to flight tracker page and upon entering data clicks on the search button
#      | Airline | FlightNumber |
#      | JetBlue | 564          |
#    Then user should the flight tracker page
