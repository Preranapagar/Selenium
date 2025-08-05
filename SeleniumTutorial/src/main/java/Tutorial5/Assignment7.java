package Tutorial5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment7 {
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/inventory.html");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		WebElement wb = driver.findElement(By.cssSelector(".product_sort_container"));
		
		Select sel = new Select(wb);
		sel.selectByValue("hilo");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-fleece-jacket")).click();
		driver.findElement(By.className("shopping_cart_link")).click();
		driver.findElement(By.id("checkout")).click();
		
		driver.findElement(By.id("first-name")).sendKeys("Mona");
		driver.findElement(By.id("last-name")).sendKeys("Darling");
		driver.findElement(By.id("postal-code")).sendKeys("423502");
		
		driver.findElement(By.id("continue")).click();
	}

}
