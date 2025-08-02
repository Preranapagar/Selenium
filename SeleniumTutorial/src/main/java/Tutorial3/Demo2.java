package Tutorial3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {

	public static void main(String[]args){
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/reg");
		
		WebElement wb = driver.findElement(By.cssSelector("#month"));
		
		Select sel = new Select(wb);
		
		sel.selectByVisibleText("Dec");
		


	}

}
