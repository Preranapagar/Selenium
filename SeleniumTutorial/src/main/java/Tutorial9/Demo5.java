package Tutorial9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo5 {
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable");
		
		WebElement frame = driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(frame);
		
		WebElement wb = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		Actions act = new Actions(driver);
		
		act.clickAndHold(wb).build().perform();
		
		WebElement wb2 = driver.findElement(By.id("droppable"));
		
		act.release(wb2).build().perform();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
