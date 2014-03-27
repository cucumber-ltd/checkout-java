package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class Stepdefs {
    private Checkout checkout = new Checkout();

    @Given("^the price of an? (\\w+) is (\\d+)c$")
    public void the_price_of_an_item_is_c(String item, int priceInCents) throws Throwable {
        checkout.setItemPrice(item, priceInCents);
    }

    @When("^I click (.+)")
    public void i_click(String item) throws Throwable {
        checkout.addItem(item);
    }

    @Then("^it should display (\\d+)c$")
    public void it_should_display_c(int expectedTotal) throws Throwable {
        // expected_total.should == actual_total
        assertEquals(expectedTotal, checkout.getTotal());
    }

}
