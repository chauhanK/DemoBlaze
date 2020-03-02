package demoonline;

import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class PurchaseItems
{

   @Given("^User launches the application$")
   public void user_launches_the_application() throws Throwable
   {
      /*Chrome driver launch code
      and naviagtion to URl*/
   }

   @When("^User fills the web form and click on \"([^\"]*)\"$")
   public void user_fills_the_web_form_and_click_on_something(String strArg1) throws Throwable
   {
    // Will use xpaths to locate input text field and use sendKeys to input data
   }

   @Then("^User deletes \"([^\"]*)\" product$")
   public void user_deletes_something_product(String strArg1) throws Throwable
   {
      //locate delete button and click
      //driver.click()
   }

   @Then("^User assert the purchase Id and amount$")
   public void user_assert_the_purchase_id_and_amount() throws Throwable
   {
//use getText() to fetch data and assert with expected data using AssertThat
   }

   @And("^User clicks on \"([^\"]*)\" from the product categories list$")
   public void user_clicks_on_something_from_the_product_categories_list(String strArg1) throws Throwable
   {
     // locate element(by xpath,name,id etc) and click
   }

   @And("^User click \"([^\"]*)\"$")
   public void user_click_something(String strArg1) throws Throwable
   {
   // locate element(by xpath,name,id etc) and click
   }

   @And("^click on \"([^\"]*)\"$")
   public void click_on_something(String strArg1) throws Throwable
   {
   // locate element(by xpath,name,id etc) and click
   }

   @And("^User click on \"([^\"]*)\" button on the popup window$")
   public void user_click_on_something_button_on_the_popup_window(String strArg1) throws Throwable
   {
   // locate element(by xpath,name,id etc) and click
   }

   @And("^User click on the \"([^\"]*)\" button$")
   public void user_click_on_the_something_button(String strArg1) throws Throwable
   {
   // switch to alert pop and accept

     // driver.switchTo().alert().accept();
   }

   @And("^User clicks OK$")
   public void user_clicks_ok() throws Throwable
   {
   // locate element(by xpath,name,id etc) and click
   }

}
