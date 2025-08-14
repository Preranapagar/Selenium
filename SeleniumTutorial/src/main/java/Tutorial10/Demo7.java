package Tutorial10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo7 {
	
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://copyright.gov.in/UserRegistration/frmNewUser.aspx");
		
		Actions act = new Actions(driver);
		
		WebElement wb = driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtFName"));
		
		act.sendKeys(wb,"Nayan").build().perform();
		
		Thread.sleep(2000);
		
		act.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		
		Thread.sleep(2000);
		
		act.keyDown(Keys.CONTROL).sendKeys("c").build().perform();
		
		Thread.sleep(2000);
		
		act.keyUp(Keys.CONTROL).build().perform();
		
		Thread.sleep(2000);
		
		act.keyDown(Keys.TAB).build().perform();
		
		Thread.sleep(2000);
		
		act.keyUp(Keys.TAB).build().perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		
		act.keyUp(Keys.CONTROL).build().perform();
		
	
	}

}
