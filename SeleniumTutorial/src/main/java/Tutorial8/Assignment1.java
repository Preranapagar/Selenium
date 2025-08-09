package Tutorial8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		WebElement wb = driver.findElement(By.id("name"));
		wb.sendKeys("Main Frame");
		
		driver.switchTo().frame("frm1");
		
		System.out.println("Switched to frame 1");
		
		Thread.sleep(3000);
		
		WebElement menu = driver.findElement(By.cssSelector("select[id='selectnav2']"));
		
		Select menusel = new Select(menu);
		
		menusel.selectByVisibleText("Contact");
		
		System.out.println("Contact selected");
		
		WebElement contact = driver.findElement(By.cssSelector("#selectnav1"));
		Select contactsel = new Select(contact);
		contactsel.selectByVisibleText("- Alerts");
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#alertBox")).click();
		
		Alert alt = driver.switchTo().alert();
		String a = alt.getText();
		System.out.println(a);
		alt.accept();
		
		
		
		
		
		
	}

}
