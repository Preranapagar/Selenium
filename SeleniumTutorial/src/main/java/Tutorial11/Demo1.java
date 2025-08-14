package Tutorial11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		
		
		WebElement wb = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		wb.sendKeys("Laptop");


		driver.findElement(By.xpath("//input[@type='submit' and @value='Go']")).click();
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//li[@class='nav-li']/descendant::a[starts-with(text(),'MX')]")).click();

	

	}

}
