package Tutorial3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {
	public static void main(String[]args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://copyright.gov.in/UserRegistration/frmNewUser.aspx");
		
		WebElement wb = driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_ddlCountry"));
		
		Select sel = new Select(wb);
		
		sel.selectByVisibleText("Hungary");
	}

}
