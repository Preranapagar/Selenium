package Tutorial2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	
	public static void main(String[] args)throws InterruptedException {
//		open a chrome browser
		
		WebDriver driver = new ChromeDriver();
		
//		maximize browser
		
		driver.manage().window().maximize();
		
//		Open a sauce Demo application
		
		driver.get("https://www.saucedemo.com");
		
//		find and enter value in username text box
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
//		find and enter value in password text box
		
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
//		find and click on login button
		driver.findElement(By.name("login-button")).click();
		
//		capture title
		
		String title = driver.getTitle();
		System.out.println(title);
		
//		capture url
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
//		find and click on add  to cart button
		
		Thread.sleep(5000);
		driver.close();


		

	}

}
