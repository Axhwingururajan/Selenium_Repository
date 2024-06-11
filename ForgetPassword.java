package virtualmaze;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgetPassword {
		public static void main(String[] args){
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://tracker.vmmaps.com/login");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//div[(@class,'rememberme-forgotPass-text')])[2]")).click();
			driver.findElement(By.id("email")).sendKeys("ashwingururajan@gmail.com");
			driver.findElement(By.className("sc-gLLuof kuxdqO")).click();
	}
}
