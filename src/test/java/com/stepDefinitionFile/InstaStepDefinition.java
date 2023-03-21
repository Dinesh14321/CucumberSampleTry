package com.stepDefinitionFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class InstaStepDefinition {

	public static WebDriver driver;

	@Given("user is on the login URL page {string}")
	public void user_is_on_the_login_url_page(String string) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(string);

	}

	@When("user should enter the valid username & password")
	public void user_should_enter_the_valid_username_password() {

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("dinesh.nirmala94@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Dinesh@94");
	}

	@When("user sholud click the login button")
	public void user_sholud_click_the_login_button() {

		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("get the failure results")
	public void get_the_failure_results() {
		WebElement text = driver.findElement(By.id("slfErrorAlert"));
		System.out.println(text.getText());
	}
}
