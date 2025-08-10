package Tutorial8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://praf002.github.io/");
		
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Prerana");
		
		driver.switchTo().frame("mobileFrame");
		
		Thread.sleep(2000);
		driver.findElement(By.id("mob")).sendKeys("456789");
		
		driver.switchTo().frame("showcheckbox");
		
		Thread.sleep(2000);
		WebElement gh = driver.findElement(By.id("GitHub"));
		gh.click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("addressframe");
		
		WebElement add = driver.findElement(By.id("add"));
		add.sendKeys("Manorama Apartments");
		
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mobileFrame");
		driver.switchTo().frame("showcheckbox");
		gh.click();
		
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("addressframe");
		driver.switchTo().frame("toolframe");
		
		
		WebElement wb = driver.findElement(By.id("course"));
		Select sel = new Select(wb);
		sel.selectByVisibleText("Cucumber");
		
		driver.switchTo().frame("seleniumFrame");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[href='https://www.selenium.dev/']")).click();
		
		driver.switchTo().defaultContent();
		name.clear();
		name.sendKeys("Madhura");
		
		driver.switchTo().frame("addressframe");
		driver.switchTo().frame("toolframe");
		sel.selectByVisibleText("Java Script Executor");
		
		driver.switchTo().parentFrame();
		add.clear();
		add.sendKeys("Prabhat Road");
		
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
