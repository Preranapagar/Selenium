package Tutorial3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assigment2 {
	public static void main(String[]args) {
		
//		- login
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/inventory.html\r\n"
				+ "");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
//		- select high to low price
		WebElement filter = driver.findElement(By.className("product_sort_container"));
		
		Select sel1 = new Select(filter);
		sel1.selectByVisibleText("Price (high to low)");
		
//		- click on first add to cart button
		driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
		
//		- click on container
		driver.findElement(By.className("shopping_cart_link")).click();
		
//		- click on checkout
		driver.findElement(By.id("checkout")).click();
		
//		- enter first name, last name and zip
		driver.findElement(By.id("first-name")).sendKeys("Radhika");
		driver.findElement(By.id("last-name")).sendKeys("Mohan");
		driver.findElement(By.id("postal-code")).sendKeys("423501");
		
//		- click on continue button
		driver.findElement(By.id("continue")).click();
		
//		- click on finish button
		driver.findElement(By.id("finish")).click();

	}

}
