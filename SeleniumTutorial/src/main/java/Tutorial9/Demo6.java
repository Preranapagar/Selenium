package Tutorial9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo6 {
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable");
		
		WebElement iframe = driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(iframe);
		
		WebElement wb1 = driver.findElement(By.id("draggable"));
		WebElement wb2 = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(wb1,wb2).build().perform();
		
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
