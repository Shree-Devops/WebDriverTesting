import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverInterface {
	
	public static String browser = "firefox";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Ranu documents\\Selenium\\Applications\\chromedriver.exe");
		driver = new ChromeDriver(); //FirefoxDriver driver is initialized and hence will open firefox
		
		driver.get("https://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("06shreemohini@gmail.com");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("navo1234");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
		driver.manage().window().maximize();
		/* Options opt = driver.manage();//Options is an interface having manage() method, Manage method is implemented in RemoteWebDriver which is a parent class of Webdriver class.
		Window win = opt.window(); //Window is class having maximize method
		win.maximize();
		*/
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);// Implicit wait, once declared, applicable for each element until the driver dies
		//Implicit Wait will not through error if the element is present but may be not visible on the page.
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='tgnCOd']")));
		// Explicit wait only for one perticular element.
		
		
	}
}
