package stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test {

	@Given("^I launch \"([^\"]*)\" page$")
	public void i_launch_page(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Launching "+arg1+" page");
	}

	@When("^I fill in \"([^\"]*)\" with kms\\.admin@gmail\\.com$")
	public void i_fill_in_with_kms_admin_gmail_com(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Enter email as "+arg1);
	}

	@When("^I fill in \"([^\"]*)\" with kms@(\\d+)$")
	public void i_fill_in_with_kms(String arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Enter username "+arg1+" and password "+arg2);
	}

	@When("^I click on \"([^\"]*)\" button$")
	public void i_click_on_button(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("I click on "+arg1+" button");
	}

	@Then("^I am on the \"([^\"]*)\" page$")
	public void i_am_on_the_page(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Now I am on the "+arg1+" page");
	}

	@When("^I fill in \"([^\"]*)\" with kms\\.user@gmail\\.com$")
	public void i_fill_in_with_kms_user_gmail_com(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Enter email as "+arg1);

	}

}
