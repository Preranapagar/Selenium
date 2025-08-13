package Tutorial9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement wb = driver.findElement(By.cssSelector("a[aria-label='Electronics']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(wb).build().perform();
		
		Thread.sleep(3000);
		
		
		
	}

}
