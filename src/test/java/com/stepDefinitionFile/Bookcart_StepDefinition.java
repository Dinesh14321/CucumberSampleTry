package com.stepDefinitionFile;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Bookcart_StepDefinition {

	public static WebDriver driver;

	@Given("user click the url {string}")
	public void user_click_the_url(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}

	@Given("user clicks the login button")
	public void user_clicks_the_login_button() {
		driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[3]")).click();
	}

	@Given("user enter the username as {string}")
	public void user_enter_the_username_as(String username) {
		driver.findElement(By.xpath("//input[@data-placeholder='Username']")).sendKeys(username);
	}

	@Given("user enter the password as {string}")
	public void user_enter_the_password_as(String password) {
		driver.findElement(By.xpath("//input[@data-placeholder='Password']")).sendKeys(password);
	}

	@When("user enter the login button")
	public void user_enter_the_login_button() {
		driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[8]")).click();
	}

	@Then("Login page should be success")
	public void login_page_should_be_success() {
		String name = driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[4]")).getText();
		System.out.println("Positive Statement:" + name);
		driver.close();
	}

	@Given("user clicks the url {string}")
	public void user_clicks_the_url(String Url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(Url);
	}

	@Given("user clicks login button")
	public void user_clicks_login_button() {
		driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[3]")).click();
	}

	@Given("user enter the username {string}")
	public void user_enter_the_username(String userName) {
		driver.findElement(By.xpath("//input[@data-placeholder='Username']")).sendKeys(userName);
	}

	@Given("user enter the password {string}")
	public void user_enter_the_password(String passWord) {
		driver.findElement(By.xpath("//input[@data-placeholder='Password']")).sendKeys(passWord);
	}

	@When("user enter login button")
	public void user_enter_login_button() {
		driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[8]")).click();
	}

	@Then("Login should fail")
	public void login_should_fail() {
		String print = driver.findElement(By.cssSelector("mat-card-subtitle")).getText();
		System.out.println("Failure Statement:" + print);
		driver.close();
	}

	@Given("User navigate to the bookcart application {string}")
	public void user_navigate_to_the_bookcart_application(String urlEntry) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(urlEntry);
	}

	@When("user login to the application with {string} and {string}")
	public void user_login_to_the_application_with_and(String uName, String pWord) {
		driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[3]")).click();
		driver.findElement(By.xpath("//input[@data-placeholder='Username']")).sendKeys(uName);
		driver.findElement(By.xpath("//input[@data-placeholder='Password']")).sendKeys(pWord);
	}

	@When("user search for a {string}")
	public void user_search_for_a(String bookName) throws AWTException {
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(bookName);
		// driver.findElement(By.cssSelector("")).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	@When("user add the book to the cart")
	public void user_add_the_book_to_the_cart() throws InterruptedException {
		driver.findElement(By.cssSelector(".mat-focus-indicator.mat-raised-button")).click();
		Thread.sleep(10000);
	}

	@Then("the card should be updated")
	public void the_card_should_be_updated() {
		WebElement count = driver.findElement(By.cssSelector("button[class='mat-focus-indicator mat-icon-button mat-button-base'] mat-icon:nth-child(1)"));
		String number = count.getText();
		System.out.println("No of products in cart:"+number);

	}

}
