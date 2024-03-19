import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    public static void main(String[] args) throws InterruptedException {
        // implicit wait - 5seconds timeout
        
        System.setProperty("webdriver.chrome.driver", "C:/Users/ramem/OneDrive/Documents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("ram");
        driver.findElement(By.name("inputPassword")).sendKeys("hello123");
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//input[@placeholder]")).sendKeys("Ram");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("ram@email.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("ram@email.com");
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("87000");
        driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        
        
        
    }
}
