package Tutorial9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2 {
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement wb = driver.findElement(By.cssSelector("span[class = 'context-menu-one btn btn-neutral']"));
		
		Actions act = new Actions(driver);
		
		Thread.sleep(2000);
		
		act.contextClick(wb).build().perform();
		
		WebElement copy = driver.findElement(By.cssSelector("li.context-menu-item.context-menu-icon.context-menu-icon-copy"));
		
		act.click(copy).build().perform();
		
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();
		
		String t = alt.getText();
		
		System.out.println(t);
		
		alt.accept();
		
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
