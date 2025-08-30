package Tutorial15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo1 {
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		Thread.sleep(5000);
		
		WebElement submit = driver.findElement(By.id("submit"));
		
		Actions act = new Actions(driver);
		
		act.scrollToElement(submit).build().perform();
		
		driver.findElement(By.xpath("//div[@id='state']/descendant::div[@class=' css-1hwfws3']")).click();
		
	}

}
