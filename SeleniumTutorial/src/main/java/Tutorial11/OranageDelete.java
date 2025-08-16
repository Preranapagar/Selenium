package Tutorial11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OranageDelete {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		//Enter username
		driver.findElement(By.xpath("//input[@name='username' or placeholder='Username']")).sendKeys("Admin");
		//Enter Password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		//Click on login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//a[contains(@href,'viewPimModule')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("i.oxd-icon.bi-trash")).click();

	}

}
