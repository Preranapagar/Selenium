package Tutorial9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo4 {
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/buttons");
		
		Thread.sleep(2000);
		
		WebElement wb = driver.findElement(By.id("rightClickBtn"));
		
		Actions act = new Actions(driver);
		
		act.contextClick(wb).build().perform();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
