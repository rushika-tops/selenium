package groupTest;

import org.testng.annotations.Test;

public class Products {
	@Test(groups="purchase")
	public void viewProducts() {
		System.out.println("view");
		
	}
	@Test(groups="purchase")
	public void addToCart() {
		System.out.println("Cart");
		
	}
	@Test
	public void remove() {
		System.out.println("remove");
		
	}
	@Test
	public void addToWishList() {
		System.out.println("wishlist");
		
	}

}
