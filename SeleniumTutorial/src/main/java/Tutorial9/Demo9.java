package Tutorial9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo9 {
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement wb = driver.findElement(By.id("nav-search-submit-button"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(wb).build().perform();
		
		WebElement wb2 = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		
		Thread.sleep(2000);
		
		act.moveToElement(wb2).build().perform();
	}

}
