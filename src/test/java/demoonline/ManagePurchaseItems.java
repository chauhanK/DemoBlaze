package demoonline;

import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class ManagePurchaseItems
{

   PurchaseItems purchase = new PurchaseItems();

   @Given("^User launches the application$")
   public void user_launches_the_application() throws Throwable
   {
      purchase.launch();
   }

   @When("^User fills the web form and clicks on \"([^\"]*)\" Button$")
   public void user_fills_the_web_form_and_clicks_on_something(String value) throws Throwable
   {
      purchase.fillForm(value);
   }

   @Then("^User deletes \"([^\"]*)\" product$")
   public void user_deletes_something_product(String value) throws Throwable
   {
      purchase.deleteProduct(value);
   }

   @Then("^User assert the purchase Id and amount \"([^\"]*)\"$")
   public void user_assert_the_purchase_id_and_amount_something(String value) throws Throwable
   {
       purchase.assertAmount(value);
   }

   @And("^User clicks on \"([^\"]*)\" from the product categories list$")
   public void user_clicks_on_something_from_the_product_categories_list(String value) throws Throwable
   {
      purchase.clickCategory(value);
   }

   @And("^User clicks \"([^\"]*)\" product$")
   public void user_clicks_something_product(String value) throws Throwable
   {
      purchase.clickProduct(value);
   }

   @And("^User clicks on \"([^\"]*)\" button$")
   public void user_clicks_on_something_button(String value) throws Throwable
   {
      purchase.clickButton(value);
   }

   @And("^User clicks on OK button on the popup window$")
   public void user_clicks_on_something_button_on_the_popup_window() throws Throwable
   {
      purchase.clickPopUp();
   }

}
