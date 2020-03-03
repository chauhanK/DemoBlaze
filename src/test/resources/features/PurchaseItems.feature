Feature: Purcahse an item

  Scenario: Validate the flow of purchasing an item
    Given User launches the application
    And User clicks on "Laptops" from the product categories list
    And User clicks "Sony vaio i5" product
    And User clicks on "Add to cart" button
    And User clicks on OK button on the popup window
    And User clicks on "Home" button
    And User clicks on "Laptops" from the product categories list
    And User clicks "Dell i7 8gb" product
    And User clicks on "Add to cart" button
    And User clicks on OK button on the popup window
    And User clicks on "Cart" button
    Then User deletes "Dell i7 8gb" product
    And User clicks on "Place Order" button
    When User fills the web form and clicks on "Purchase" Button
    Then User assert the purchase Id and amount "Amount: 1490 USD"
    And User clicks on "OK" button
