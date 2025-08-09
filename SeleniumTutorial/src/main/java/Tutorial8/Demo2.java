package Tutorial8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://prafpawar11.github.io/twoFrame.html");
		
		driver.findElement(By.id("name")).sendKeys("Pratik");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("Cucumber")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		
		WebElement wb = driver.findElement(By.id("course"));
		
		Select sel = new Select(wb);
		
		sel.selectByValue("8");
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("name")).clear();
		
		
		
		
	}

}
