package Tutorial8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.switchTo().frame("singleframe");
		System.out.println("Frame switched");
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Success");
		
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		System.out.println("Frame switched to default");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		
		WebElement frame1 = driver.findElement(By.cssSelector("iframe[src=\"MultipleFrames.html\"]"));
		driver.switchTo().frame(frame1);
		System.out.println("Frame switched to Nested Parent");
		
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		System.out.println("Frame switched to Nested Child");
		
	
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div.col-xs-6.col-xs-offset-5 input")).sendKeys("Another Success");
		
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
