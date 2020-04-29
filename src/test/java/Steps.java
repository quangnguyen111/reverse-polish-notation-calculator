import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Steps {
	private String input;
	
	@Given("^user enter \"([^\"]*)\"$")
	public void user_enter(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		this.input = arg1;
	}

	@Then("^result is (\\d+)$")
	public void result_is(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		RPNCalculator calculator = new RPNCalculator();
		assertEquals(arg1, calculator.add(this.input)); 
	}

}
