package Test;

public class FBLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			
			WebElement UserName = driver.findElement(By.xpath("//input[@name='email']"));
			
			WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
			
			WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
			
			UserName.sendKeys("abcdef@xyz.com");
			Password.sendKeys("abcddd@123");
			LoginButton.click();
			
			driver.close();
		
		
	}

}
