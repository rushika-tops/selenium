package groupTest;

import org.testng.annotations.Test;

public class Users {
	@Test
	public void createaccount() {
		System.out.println("create Account");
		}
	@Test
	public void logOut() {
		System.out.println("LogOut");
		}
	
	@Test(groups="purchase")
	public void logIn() {
		System.out.println("LogIn");
		}
}
