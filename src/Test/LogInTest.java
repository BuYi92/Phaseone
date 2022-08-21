package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdiver.chrome.driver", "chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();
		
		
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys("abc@xyz.com");
		
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Test@1234");
		
		WebElement Rememberme = driver.findElement(By.className("rememberMe"));
		Rememberme.click();
		
		WebElement Login = driver.findElement(By.name("btn_login"));
		Login.click();
	}

}
