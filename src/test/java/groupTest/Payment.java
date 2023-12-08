package groupTest;

import org.testng.annotations.Test;

public class Payment {
	@Test
	public void upi() {
		System.out.println("upi");
		
	}
	@Test(groups="purchase")
	public void cod() {
		System.out.println("cod");
		
	}
	@Test
	public void creditCard() {
		System.out.println("credit card");
		
	}
	

}
