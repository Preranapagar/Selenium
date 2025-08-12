package Tutorial9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo5 {
	public static void main(String[]args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable");
		
		WebElement wb = driver.findElement(By.cssSelector("div#draggable"));
		
		Actions act = new Actions(driver);
		
		act.clickAndHold(wb).build().perform();
	}

}
