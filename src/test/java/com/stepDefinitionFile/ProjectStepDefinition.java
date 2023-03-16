package com.stepDefinitionFile;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectStepDefinition {

	public static WebDriver driver;

	@Given("user can enter the Url {string}")
	public void user_can_enter_the_url(String string) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(string);
	}

	@When("user enter India in the search box")
	public void user_enter_india_in_the_search_box() {

		driver.findElement(By.name("q")).sendKeys("India", Keys.ENTER);

	}

	@Then("user can able to view India page")
	public void user_can_able_to_view_india_page() {

	}
}
