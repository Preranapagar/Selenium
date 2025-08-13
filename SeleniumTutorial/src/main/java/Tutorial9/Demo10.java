package Tutorial9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo10 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.qafeast.com/demo");
		
		Actions act = new Actions(driver);
		
		WebElement wb = driver.findElement(By.xpath("//label[text()='Scrolling']"));
		
		act.click(wb).build().perform();
		
		WebElement wb2 = driver.findElement(By.id("submitbtn"));
		
		act.scrollToElement(wb2).build().perform();
		
		
	}
	

}
