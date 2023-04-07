import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBrowser {
	
	public static String browser = "firefox";
	public static ChromeDriver driver; // object created but not initialized and has value null

	public static void main(String[] args) {
		
		/*System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\Ranu documents\\Selenium\\Applications\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(title.length());  // String class has the length function
		*/
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\Ranu documents\\Selenium\\Applications\\geckodriver.exe");
		
		if (browser=="firefox") {
			FirefoxDriver driver = new FirefoxDriver(); //FirefoxDriver driver is initialized and hence will open firefox
		}
		else if (browser == "chrome") {
			driver = new ChromeDriver();
		}
		
		driver.get("https://www.google.com"); // ChromeDriver driver is not initialized yet hence null pointer exception
		
	}
}
