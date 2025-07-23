package test;

import org.testng.annotations.Test;

public class PriorityConcepts {
	
	@Test (priority = 3)
	public void ordered() {
		System.out.println("Ordered Method");
	}
	
	@Test (priority = 4)
	public void payment() {
		System.out.println("Payment Method");
	}
	
	@Test (priority = 2)
	public void dashboard() {
		System.out.println("Dashboard Method");
	}
	
	@Test (priority = 1)
	public void login() {
		System.out.println("Login Method");
	}

}
