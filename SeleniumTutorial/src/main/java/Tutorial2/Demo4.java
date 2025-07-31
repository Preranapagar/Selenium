package Tutorial2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstname")).sendKeys("Pavan");
		
		Thread.sleep(5000);
		
		driver.close();
	
	}

}
