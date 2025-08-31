package Tutorial15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {
	public static void main(String[]args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstName")).sendKeys("Natasha");
		driver.findElement(By.name("lastName")).sendKeys("Atole");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//label[text()='Nationality']/parent::div/following-sibling::div/descendant::div[@class='oxd-select-text-input']")).click();
		
		Thread.sleep(2000);
		
		List<WebElement> countries = driver.findElements(By.xpath("//label[text()='Nationality']/parent::div/following-sibling::div/descendant::span"));
		
		for (WebElement value : countries) {
			String actualvalue = value.getText();
			
			if(actualvalue.equals("Indian")) {
				value.click();
				break;
			}
		}
		
		Thread.sleep(5000);
		
		
		
		
		
	}

}
