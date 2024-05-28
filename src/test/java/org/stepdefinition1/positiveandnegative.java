package org.stepdefinition1;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class positiveandnegative extends BaseClass {
	@Given("User has to launch the chrome browser and maximize the window")
	public void user_has_to_launch_the_chrome_browser_and_maximize_the_window() {
		launchBrowser();
		windowMaximize();
	}

	@When("User has to launch the url of facebook application")
	public void user_has_to_launch_the_url_of_facebook_application() {
		driver.get("https://www.facebook.com/");
	 
	}

	@When("User has to pass username \"abc11@gamil.com\"in email field")
	public void user_has_to_pass_username_abc11_gamil_com_in_email_field() {
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));  
		email.sendKeys("abc11@gmail.com");

	}

	@When("User has to pass password \"abc11\"in password field")
	public void user_has_to_pass_password_abc11_in_password_field() {
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	    pass.sendKeys("abc11");
	    
	    
	}

	@When("User has to click login button")
	public void user_has_to_click_login_button() {
		WebElement login = driver.findElement(By.name("login"));
	    login.click();
	    
	}

	@When("User has to check whether navigate to the homepage or not")
	public void user_has_to_check_whether_navigate_to_the_homepage_or_not() {
		System.out.println("check your url?");
	 
	}

	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() {
		closeEntireBrowser();
	    
	}

	@When("User has to pass username \"banu12@gmail.com\"in email field")
	public void user_has_to_pass_username_banu12_gmail_com_in_email_field() {
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));  
		email.sendKeys("banu12@gmail.com");
	  
	}

	@When("User has to pass password \"banu\"in password field")
	public void user_has_to_pass_password_banu_in_password_field() {
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	    pass.sendKeys("banu");
	    
	   
	}




}
