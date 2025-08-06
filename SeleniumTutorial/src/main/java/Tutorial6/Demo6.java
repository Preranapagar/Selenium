package Tutorial6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("Karishma");
		driver.findElement(By.id("alertbtn")).click();
		
		Alert alt = driver.switchTo().alert();
		String a = alt.getText();
		System.out.println(a);
		Thread.sleep(3000);
		alt.accept();
		
		driver.findElement(By.id("confirmbtn")).click();
		Alert alt2 = driver.switchTo().alert();
		String b = alt2.getText();
		System.out.println(b);
		Thread.sleep(3000);
		alt2.dismiss();
		
		
	}

}
