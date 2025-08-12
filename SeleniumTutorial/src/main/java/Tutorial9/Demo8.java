package Tutorial9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo8 {
	public static void main(String[]args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in");
		
		WebElement wb = driver.findElement(By.linkText("Peru"));
		
		Actions act = new Actions(driver);
		
		act.scrollToElement(wb).build().perform();
		
		
	}

}
