package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo {
	
	@Given("^I am a ([a-zA-Z]{1,}) software tester$")
	public void i_am_a_good_software_tester(String type) {
	    System.out.println("Software tester is: "+type);
	}

	@When("^I go to work$")
	public void i_go_to_work() {
	    System.out.println("Inside go to work method");
	}

	@And("^I ([a-zA-Z]{1,}) with it$")
	public void i_involve_with_it(String state) {
	    System.out.println("I "+state+" with it.");
	}

	@Then("^My boss ([a-zA-Z]{1,}) me$")
	public void my_boss_loves_me(String bossState) {
	    System.out.println("My boss "+bossState+" me.");
	}

}
