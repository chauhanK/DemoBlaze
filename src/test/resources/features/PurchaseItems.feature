Feature: Purcahse an item

  @tag1
  Scenario: Validate the flow of purchasing an item
    Given User launches the application
    And User clicks on "Laptop" from the product categories list
    And User click "Sony vaio i5"
    And click on "Add to Cart"
    And User click on "OK" button on the popup window
    And User click on the "Home" button
    And User clicks on "Laptop" from the product categories list
    And User click "Dell i7 8gb"
    And click on "Add to Cart"
    And User click on "OK" button on the popup window
    And User click on "Cart" button
    Then User deletes "Dell i7 8gb" product
    And User clicks on "Place Order"
    When User fills the web form and click on "Purchase Button"
    Then User assert the purchase Id and amount
    And User clicks OK
