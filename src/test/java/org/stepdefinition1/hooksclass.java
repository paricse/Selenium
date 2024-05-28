package org.stepdefinition1;

import org.base.BaseClass;



import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooksclass extends BaseClass {
	@Before("@sanity")
	private void precondition1() {
		launchBrowser();
		System.out.println("launch the browser");
		
		}
	@Before("@smoke")
		private void precondition2() {
			System.out.println("maximize the window");
		    windowMaximize();
		    }
   @Before(order=2 , value="@smoke")
	    private void precondition3() {
		System.out.println("precoditions3");
			    
			    
	}
   @After("@sanity")
	 private void Postcondition1() {
		System.out.println("close the browser");
		}
	
	@After("@sanity")
	 private void Postcondition() {
		closeEntireBrowser();
		
	}

}


