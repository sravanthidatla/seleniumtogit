package skeleton;

import io.cucumber.java.en.Given;

public class sarahcucmber {
	
	@Given("(Sarah|She) has {double} Cucumber(s) in {word} {word}")
	public void sarah_has_Cucumbers_in_her_bag(Double double1,String string1,String string2) {
	   System.out.println(double1+"\t"+string1+"\t"+string2);
	}






}
