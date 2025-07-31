package Tutorial2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://copyright.gov.in/UserRegistration/frmNewUser.aspx");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtFName")).sendKeys("Kesham");
		
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtLName")).sendKeys("Kunal");
		
		driver.close();
	}

}
