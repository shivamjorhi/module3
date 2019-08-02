package stepDef;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test {

	@Given("^I am not logged in as an administrator$")
	public void i_am_not_logged_in_as_an_administrator() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Not logged in");
	}

	@When("^I go to the administrative page$")
	public void i_go_to_the_administrative_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Going to admin page");
	}

	@When("^I fill in the fields$")
	public void i_fill_in_the_fields(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    //throw new PendingException();
		System.out.println("Filling fields "+arg1);
	}

	@When("^I press \"([^\"]*)\"$")
	public void i_press(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Pressing "+arg1);
	}

	@Then("^I should be on the administrative page$")
	public void i_should_be_on_the_administrative_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("On the admin page");
	}

	@Then("^I should see \"([^\"]*)\"$")
	public void i_should_see(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Now I see "+arg1);
	}
	@Given("^I am logged in as admin$")
	public void i_am_logged_in_as_admin() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Logged in as admin");
	}
	

	@Then("^I should return back to home page$")
	public void i_should_return_back_to_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Returning to home page");
	}
}
