package Tutorial8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	public static void main(String[]args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://prafpawar11.github.io/mainFrame.html");
		
		driver.findElement(By.id("name")).sendKeys("Anushka");
		
		driver.switchTo().frame("mainframe");
		
		driver.findElement(By.id("TestNG")).click();
	}

}
