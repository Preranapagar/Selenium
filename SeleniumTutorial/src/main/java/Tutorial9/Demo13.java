package Tutorial9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo13 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kybarg.github.io/bootstrap-dropdown-hover/");
		
		Actions act = new Actions(driver);
		
		WebElement wb = driver.findElement(By.xpath("//div[@class='dropdown pull-left']"));
		
		act.moveToElement(wb).build().perform();
		
		Thread.sleep(2000);
		
		WebElement wb2 = driver.findElement(By.cssSelector("li.dropdown a[href='#']"));
		
		act.moveToElement(wb2).build().perform();
		
		Thread.sleep(2000);
		
		WebElement wb3 = driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdownhover-right']/descendant::a[text()='One more dropdown ']"));
		
		act.moveToElement(wb3).build().perform();
		
		
		
		
	}

}
