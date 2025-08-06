package Tutorial6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("confirmbtn")).click();
		
		Alert alt = driver.switchTo().alert();
		
		String a = alt.getText();
		
		System.out.println(a);
		
		alt.accept();
		
		driver.close();
		

	}

}
