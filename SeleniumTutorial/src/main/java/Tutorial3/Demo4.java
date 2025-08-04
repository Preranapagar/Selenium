package Tutorial3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo4 {
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement wb = driver.findElement(By.name("country"));
		
		Select sel = new Select(wb);
		
		sel.selectByVisibleText("INDIA");
		
		Thread.sleep(5000);
		driver.close();
	}

}
