package Tutorial12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class olxassignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.olx.in/");
		Thread.sleep(4000);
		
		//Click on Location drop down
		WebElement location = driver.findElement(By.xpath("//input[starts-with(@placeholder,'Search')]"));
		
		//Enter PUNE keyword in Location Text box
		location.click();
		location.sendKeys("Pune");
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		act.moveToElement(location).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
		
		//On Search Box search Car keyword and select suggested 1st car
		WebElement search = driver.findElement(By.cssSelector("[data-aut-id='searchBox']"));
		search.sendKeys("Car");
		Thread.sleep(2000);
		
		act.moveToElement(search).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
		
		
	}

}
