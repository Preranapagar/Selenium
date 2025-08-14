package Tutorial10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keydown {
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/reg");
		
		Actions act = new Actions(driver);
		
		WebElement fn = driver.findElement(By.cssSelector("input[name='firstname']"));
		
		act.sendKeys(fn,"Mona").build().perform();
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
	}
}