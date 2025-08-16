package Tutorial11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orange {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		//Enter username
		driver.findElement(By.xpath("//input[@name='username' or placeholder='Username']")).sendKeys("Admin");
		//Enter Password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		//Click on login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//capture home page title and URL
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		
		System.out.println("Title :" + title);
		System.out.println("URL :" + url);
		Thread.sleep(2000);
		
		//click on PIM Link
		driver.findElement(By.xpath("//a[contains(@href,'viewPimModule')]")).click();
		Thread.sleep(2000);
		
		//click on add employee button
		driver.findElement(By.xpath("//a[@class='oxd-topbar-body-nav-tab-item' and contains(text(),'Add')]")).click();
		Thread.sleep(2000);
		
		//enter first name, middle name, last name
		driver.findElement(By.name("firstName")).sendKeys("Aniket");
		driver.findElement(By.name("middleName")).sendKeys("A");
		driver.findElement(By.name("lastName")).sendKeys("Patil");
		Thread.sleep(2000);
		
		//click on save button
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(5000);
		
		//capture employee id
		WebElement empid = driver.findElement(By.xpath("//label[text()='Employee Id']/parent::div/following-sibling::div"));
		String emp_id = empid.getText();
		System.out.println(emp_id);
		

	}

}
