package Tutorial9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo2 {
	public static void main(String[]args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://ui.cogmento.com/");
		
		WebElement login = driver.findElement(By.cssSelector("div.ui.fluid.large.blue.submit.button"));
		
		Actions act = new Actions(driver);
		
		act.click(login).build().perform();
		
	}

}
