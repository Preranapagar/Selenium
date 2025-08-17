package Tutorial12;

import java.time.Duration;

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
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Thread.sleep(12000);
		
		//Click on Location drop down
		WebElement location = driver.findElement(By.xpath("//input[starts-with(@placeholder,'Search')]"));
		
		//Enter PUNE keyword in Location Text box
		
		Actions act = new Actions(driver);
		
		act.moveToElement(location).sendKeys(location,"Pune").keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
		
		//On Search Box search Car keyword and select suggested 1st car
		WebElement search = driver.findElement(By.cssSelector("[data-aut-id='searchBox']"));
		act.moveToElement(search).sendKeys(search,"Car").keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
		
		
	}

}
