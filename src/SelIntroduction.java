import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// Invoking Browser
		// Chrome - ChromeDriver -> Methods close get
		// Firefox - FirefoxDriver -> Methods close get
		// Safari - SafariDriver -> Methods close get
		// WebDriver -> Methods close get
		// WebDriver methods + class methods
		
		// chromedriver.exe -> Chrome browser Selenium Mangager
		// step to invoke chrome driver
		System.setProperty("webdriver.chrome.driver", "C:/Users/ramem/OneDrive/Documents/chromedriver.exe");
		
		// webdriver.chrome.driver -> value of path 
		WebDriver driver = new ChromeDriver();
		
		
		// Firefox Launch
		// GeckoDriver
		
		// webdriver.gecko.driver
		// System.setProperty("webdriver.gecko.driver", "C:/Users/ramem/OneDrive/Documents/geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();
		
		// Microsoft Edge Launch
		
		// webdriver.edge.driver
		// System.setProperty("webdriver.edge.driver", "C:/Users/ramem/OneDrive/Documents/msedgedriver.exe");
		// WebDriver driver = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
	}

}
