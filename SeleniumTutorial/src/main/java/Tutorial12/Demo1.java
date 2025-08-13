package Tutorial12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	public static void main(String[]args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Samsumg s24 ultra");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebElement wb = driver.findElement(By.xpath("//div[@data-id='MOBH3P4UBUYFSDWV']/descendant::div[@class='Nx9bqj _4b5DiR']"));

		String price = wb.getText();
		
		System.out.println(price);
	}

}
