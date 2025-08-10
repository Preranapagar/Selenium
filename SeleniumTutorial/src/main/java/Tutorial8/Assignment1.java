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
		
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frm2");
		
		System.out.println("Switched to frame 2");
		
		WebElement wb2 = driver.findElement(By.id("selectnav1"));
		Select controlsel = new Select(wb2);
		controlsel.selectByVisibleText("- Basic Controls");
		
		driver.findElement(By.id("firstName")).sendKeys("Apoorva");
		driver.findElement(By.id("lastName")).sendKeys("Patil");
		driver.findElement(By.id("femalerb")).click();
		driver.findElement(By.id("englishchbx")).click();
		driver.findElement(By.id("hindichbx")).click();
		driver.findElement(By.id("spanishchbx")).click();
		driver.findElement(By.id("email")).sendKeys("apoorva@gmail.com");
		driver.findElement(By.id("password")).sendKeys("patil789");
		
		
		System.out.println("Details Entered");
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		
	}

}
