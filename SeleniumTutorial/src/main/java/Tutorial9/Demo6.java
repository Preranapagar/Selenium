package Tutorial9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {
	public static void main(String[]args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable");
		
		WebElement iframe = driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(iframe);
		
		WebElement wb1 = driver.findElement(By.id(""))
		
		
	}

}
