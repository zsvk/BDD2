package com.StepDefinationLayer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef 
{	public static WebDriver driver;
	@Given("user is on home page")
	public void user_is_on_home_page() 
	{
	   WebDriverManager.firefoxdriver().setup();
	   driver =new FirefoxDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)).pageLoadTimeout(Duration.ofSeconds(20));
	   driver.manage().deleteAllCookies();
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("user enter valid user name")
	public void user_enter_valid_user_name() 
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		
	   
	}

	@When("user enter valid password")
	public void user_enter_valid_password() 
	{
	 driver.findElement(By.name("password")).sendKeys("admin123");   
	}

	@Then("user click on submit button")
	public void user_click_on_submit_button() 
	{driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	  
	}
	@Then("browser will close")
	public void browser_will_close() {
	  
	driver.close();
	}

}
