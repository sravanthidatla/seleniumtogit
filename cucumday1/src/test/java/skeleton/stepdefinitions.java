package skeleton;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class stepdefinitions {
	Person sean=new Person();
	
	@Given("Sean is {int} meters away from Lucia")
	public void sean_is_meters_away_from_Lucia(Integer int1) {
		
		sean.setDistance(int1);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("Sean shouts {string}")
	public void sean_shouts(String string) {
		
		sean.setMessage(string);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("Lucia hears the message {string}")
	public void lucia_hears_the_message(String string) {
		
		String message=sean.getMessage();
		Assert.assertEquals("Free Coffee",message);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("Lucia hears no message")
	public void lucia_hears_no_message() {
		String message=sean.getMessage();
		Assert.assertEquals(null,message);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}





		// TODO Auto-generated method stub

	}


