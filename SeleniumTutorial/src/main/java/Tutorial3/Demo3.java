package Tutorial3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3 {
	public static void  main(String[]args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://copyright.gov.in/UserRegistration/frmNewUser.aspx");
		
		WebElement wb1 = driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_ddlTitle"));
		
		Select sel1 = new Select(wb1);
		
		sel1.selectByIndex(3);
		
		WebElement wb2 = driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_ddlCountry"));
		
		Select sel2 = new Select(wb2);
		
		sel2.selectByVisibleText("Hungary");
		
		WebElement wb3 = driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_ddlState"));
		
		Select sel3 = new Select(wb3);
		
		sel3.selectByValue("9");
		
		Thread.sleep(5000);
		
		driver.close();
	}
	
}
