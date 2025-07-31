package Tutorial2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static void main(String[]args) {
		
//		- open a chrome browser
		WebDriver driver = new ChromeDriver();
		
//		- maximize browser
		driver.manage().window().maximize();
		
//		- Open a Guru 99 application
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
//		- find and enter value in first name text box
		driver.findElement(By.name("firstName")).sendKeys("Ravita");
		
//		- find and enter value in last name text box
		driver.findElement(By.name("lastName")).sendKeys("Patel");
		
//		- find and enter value in phone text box
		driver.findElement(By.name("phone")).sendKeys("78964532");
		
//		- find and enter value in email text box
		driver.findElement(By.name("userName")).sendKeys("ravipatel@gmail.com");
//
//		- find and enter value in address text box
		driver.findElement(By.name("address1")).sendKeys("Panchsheel Towers, Viman Nagar,Pune");
		
//		- find and enter value in city text box
		driver.findElement(By.name("city")).sendKeys("Pune");
		
//		- find and enter value in state text box
		driver.findElement(By.name("state")).sendKeys("Maharashtra");
		
//		- find and enter value in postal code text box
		driver.findElement(By.name("postalCode")).sendKeys("423501");
//
//		- find and enter value in username text box
		driver.findElement(By.name("email")).sendKeys("Ravi99");
		
//		- find and enter value in password text box
		driver.findElement(By.name("password")).sendKeys("Ravi99@Pune");
		
//		- find and click on submit button
		driver.findElement(By.name("submit")).click();


	}

}
