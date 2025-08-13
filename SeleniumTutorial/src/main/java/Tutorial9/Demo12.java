package Tutorial9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo12 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testkru.com/Elements/Buttons");
		
		Actions act = new Actions(driver);
		
		WebElement wb = driver.findElement(By.cssSelector("button#doubleClick"));
		
		act.doubleClick(wb).build().perform();
		
		WebElement wb2 = driver.findElement(By.cssSelector("button#rightClick"));
		
		act.contextClick(wb2).build().perform();
		
		WebElement wb3 = driver.findElement(By.cssSelector("button#leftClick"));
		
		act.click(wb3).build().perform();
		
		WebElement wb4 = driver.findElement(By.cssSelector("button#disabledButton"));
		
		act.click(wb4).build().perform();
		
		WebElement wb5 = driver.findElement(By.cssSelector("button#colorChangeOnHover"));
		
		act.click(wb5).build().perform();
		
		

	}

}
