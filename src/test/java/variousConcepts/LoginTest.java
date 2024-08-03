package variousConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		init();
		loginTest();
		teardown();
		
		init();
		neglogintest();
		teardown();
		
	}

	public static void init() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gshin\\OneDrive\\Desktop\\Selenium\\selenium-java-4.23.0\\crm\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies(); // Always needs to be before opening the site
		driver.get("https://codefios.com/ebilling/");
		driver.manage().window().maximize();

	}

	public static void teardown() throws InterruptedException {
		Thread.sleep(2000);// wait for 2 seconds
		driver.close();

	}
 
	public static void loginTest() {
		driver.findElement(By.id("user_name")).sendKeys("demo@codefios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.id("login_submit")).click();

	}
	
	public static void neglogintest() {
		driver.findElement(By.id("user_name")).sendKeys("demo@codefios.com");
		driver.findElement(By.id("password")).sendKeys("abc23");
		driver.findElement(By.id("login_submit")).click();

	}
}
