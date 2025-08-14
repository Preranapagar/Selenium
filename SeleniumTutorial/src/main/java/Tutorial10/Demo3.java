package Tutorial10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo3 {
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.india.gov.in");
		
		Actions act = new Actions(driver);
		
		WebElement wb = driver.findElement(By.cssSelector("input#search_key"));
		
		act.sendKeys(wb,"Pradhanmantri").build().perform();
		
		Thread.sleep(2000);
		
		act.keyDown(Keys.BACK_SPACE).keyDown(Keys.BACK_SPACE).build().perform();
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
