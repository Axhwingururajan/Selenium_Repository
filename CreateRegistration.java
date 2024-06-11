package virtualmaze;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateRegistration {
	public static void main(String[] args) throws InterruptedException{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://tracker.vmmaps.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("register-tab")).click();
		driver.findElement(By.id("Name")).sendKeys("Alex");	
		driver.findElement(By.id("email")).sendKeys("Alex@gmail.com");
		driver.findElement(By.className("PhoneInputInput")).sendKeys("896798739873");
		driver.findElement(By.id("password")).sendKeys("@Gurumala12345");
		driver.findElement(By.id("registerSubmit")).click();
		driver.findElement(By.id("login-tab")).click();
		Thread.sleep(3000);
	}
}