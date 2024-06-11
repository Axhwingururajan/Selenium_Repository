package virtualmaze;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUser {

	public static void main(String[] args){
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://tracker.vmmaps.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("ashwingururajan@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("@Gurumala123");
		driver.findElement(By.id("loginSubmit")).click();

	}

}
