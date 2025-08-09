package Tutorial8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://prafpawar11.github.io/frame.html");
		
		WebElement wb = driver.findElement(By.id("name"));
		wb.sendKeys("Kaustubh");
		
		driver.switchTo().frame(0);
		
		WebElement add = driver.findElement(By.id("add"));
		add.sendKeys("Bapat Road, Pune-04");
		
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("POM")).click();
		
		driver.switchTo().parentFrame();
		
		Thread.sleep(5000);
		add.clear();
		add.sendKeys("Koregaon Park");
		
		driver.switchTo().parentFrame();
		
		wb.clear();
		
		wb.sendKeys("Kaustubh Patil");
		
		
		
	}

}
