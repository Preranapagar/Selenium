package Tutorial10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo2 {
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		Actions act = new Actions(driver);
		
		WebElement wb = driver.findElement(By.id("user-name"));
		
		act.sendKeys(wb,"Ronak").build().perform();
		
		Thread.sleep(2000);
		
		act.keyDown(Keys.BACK_SPACE).build().perform();
		act.keyDown(Keys.BACK_SPACE).build().perform();
		act.keyDown(Keys.BACK_SPACE).build().perform();
		
		Thread.sleep(2000);
		driver.close();
				
	}

}
