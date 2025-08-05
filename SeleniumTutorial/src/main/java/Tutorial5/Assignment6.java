package Tutorial5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {
	public static void main(String[]args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.wikipedia.org/");
		
		driver.findElement(By.cssSelector("#js-link-box-en")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".cdx-text-input__input.mw-searchInput")).sendKeys("INDIA");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#searchform button.cdx-search-input__end-button")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.navigate().to("https://www.redbus.com");
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.navigate().forward();
		
		Thread.sleep(2000);
		driver.close();
		driver.quit();
		
		

	}

}
