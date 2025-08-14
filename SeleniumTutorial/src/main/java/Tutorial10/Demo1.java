package Tutorial10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1 {
	public static void main(String[]args)throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement un = driver.findElement(By.id("user-name"));
		WebElement pw = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.id("login-button"));
		
		Actions act = new Actions(driver);
		
		act.sendKeys(un,"standard_user").build().perform();
		act.sendKeys(pw,"secret_sauce").build().perform();
		act.click(login).build().perform();
		
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
