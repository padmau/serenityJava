@issue:TAXCP-146
Feature: As a amazon online shopping user I would wish to explore the website

   Story: Amazon website exploratory testing

  Scenario Outline: Select books in the search and type in harry potter and check the first result option has harry potter in it
    Given I navigate to amazon website
    And I select <Product> in the product dropdown
    And I type in '<ProductType>' in the search box
    And I press enter
    And I see that the first result has the name '<ResultText>' in it

    Examples:
    |Product |ProductType |ResultText  |
    |Books   |Harry Potter|Harry Potter|
    |Beauty  |Clinique    |Clinique    |
    |Clothing|Oasis       |Oasis       |

@Pending
  Scenario: Mouse hover on shop by department and select gorcery in the hidden list
    Given I navigate to amazon website
    And I hover mouse over 'Shop By Department' to 'Food and Grocery' and click 'Grocery'
    Then I see 'Grocery' in the H1 on results page

  Scenario: Verify shopping cart
    Given I navigate to amazon website
    And I clear the shopping basket if there are items in it
    And I type in 'Lindt' in the search box
    And I press enter
    And I select 'Lindt Lindor Milk Cornet' on the products page
    When I click add to the basket on the product page
    Then I see the shopping cart has 2 item in it