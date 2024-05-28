package org.stepdefinition1;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class fblogin extends BaseClass {
	@Given("To launch the chrome browser and maximize the window")
	public void to_launch_the_chrome_browser_and_maximize_the_window() {
		launchBrowser();
		windowMaximize();
}

	@When("To launch the url of the facebook application")
	public void to_launch_the_url_of_the_facebook_application() {
		driver.get("https://www.facebook.com/");
	  
	}

	@When("To pass  valid username in email field")
	public void to_pass_valid_username_in_email_field() {
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));  
		email.sendKeys("paricse16@gmail.com");
	    
	}

	@When("To pass  valid password in password field")
	public void to_pass_valid_password_in_password_field() {
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	    pass.sendKeys("12345");
	    
	}

	@When("To click  login button")
	public void to_click_login_button() {
		WebElement login = driver.findElement(By.name("login"));
	    login.click();
	 
	}

	@When("To check whether navigate to the homepage or not")
	public void to_check_whether_navigate_to_the_homepage_or_not() {
		System.out.println("chec url?");
	    
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		closeEntireBrowser();
	  
	}

}