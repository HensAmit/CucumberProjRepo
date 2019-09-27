package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search {
	
	@Given("^I visit the website as Guest user$")
	public void I_visit_the_website_as_Guest_user() {
		//Automation code here
		System.out.println("Inside @Given");
	}
	
	@When("^I select Books option from dropdown$")
	public void I_select_Books_option_from_dropdown() {
		System.out.println("Inside @When");
	}
	
	@And("^I click on Search icon$")
	public void I_click_on_Search_icon() {
		System.out.println("Inside @And");
	}
	
	@Then("^I should see books page loaded$")
	public void I_should_see_books_page_loaded() {
		System.out.println("Inside @Then");
	}
	
	@And("^I should see Books at Amazon as heading$")
	public void I_should_see_Books_at_Amazon_as_heading() {
		System.out.println("Inside @And");
	}
	
	@But("^I should not see other category products$")
	public void I_should_not_see_other_category_products() {
		System.out.println("Inside @But");
	}
	
	@When("^I select Baby option from dropdown$")
	public void I_select_Baby_option_from_dropdown() {
		System.out.println("Inside @When");
	}
	
	@Then("^I should see Baby page loaded$")
	public void I_should_see_Baby_page_loaded() {
		System.out.println("Inside @Then");
	}
	
	@And("^I should see The baby store as heading$")
	public void I_should_see_The_baby_store_at_Amazon_as_heading() {
		System.out.println("Inside @And");
	}

}
