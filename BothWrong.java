package LoginTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BothWrong {
	
	@Test
	public void loginWithBothWrong ()throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\YoutubeClass\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("dineshrpcg@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Dinesh@94");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		Thread.sleep(2000);
		driver.close();

	}

}
