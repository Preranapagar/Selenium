package Tutorial4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[]args)throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://copyright.gov.in/UserRegistration/frmNewUser.aspx");
		
		WebElement wb =driver.findElement(By.cssSelector("label[for='ctl00_ContentPlaceHolder1_rdoSociety']"));
		
		boolean display = wb.isDisplayed();
		System.out.println("Radio button display:"+ display);
		
		boolean enable = wb.isEnabled();
		System.out.println("Radio button enables:" + enable);
		
		
		boolean selected = wb.isSelected();
		System.out.println("Radio button selected:" + selected);
		
		Thread.sleep(5000);
		
		wb.click();
		
		Thread.sleep(5000);
		boolean selected2 = wb.isSelected();
		System.out.println("Radio button selected:" + selected2);
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
