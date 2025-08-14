package Tutorial10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo5 {
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		Actions act = new Actions(driver);
		
		WebElement un = driver.findElement(By.id("user-name"));
		
		act.sendKeys(un,"Mahopatra").build().perform();
		
		Thread.sleep(2000);
		
		act.keyDown(Keys.BACK_SPACE).build().perform();
		
		Thread.sleep(2000);
		
		act.keyDown(Keys.HOME).build().perform();
		
		Thread.sleep(2000);
		
		act.keyUp(Keys.HOME).build().perform();		
		
		Thread.sleep(2000);
		
		act.keyDown(Keys.DELETE).build().perform();
		
		act.keyUp(Keys.DELETE).build().perform();
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
