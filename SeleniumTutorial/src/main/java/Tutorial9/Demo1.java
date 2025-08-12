package Tutorial9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1 {
	public static void main(String[]args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
		WebElement wb = driver.findElement(By.xpath("//input[@id='gender-radio-2']"));
		
		Actions act = new Actions(driver);
		
		act.click(wb).build().perform();
		
	}

}
