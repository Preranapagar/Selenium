package Tutorial11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class orange {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		//Enter username
		WebElement username = driver.findElement(By.xpath("//input[@name='username' or placeholder='Username']"));
		username.sendKeys("Admin");
		
		//Enter Password
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("admin123");
		
		//Click on login button
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
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
		driver.findElement(By.name("firstName")).sendKeys("Sankar");
		driver.findElement(By.name("middleName")).sendKeys("Ehasan");
		driver.findElement(By.name("lastName")).sendKeys("Loy");
		Thread.sleep(2000);
		
		//click on save button
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(3000);
		
		//capture employee id
		WebElement empid = driver.findElement(By.xpath("//label[text()='Employee Id']/parent::div/following-sibling::div/child::input"));
		String emp_id = empid.getAttribute("value");
		System.out.println(emp_id);
		
		Thread.sleep(4000);
		
		//select Marital Status using actions class
		Actions act = new Actions(driver);
		
		WebElement ms = driver.findElement(By.xpath("//label[text()='Marital Status']/parent::div/following-sibling::div/descendant::div[@class='oxd-select-text-input']"));
		
		act.click(ms).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
		
		Thread.sleep(2000);
		
		//click on male/female radio button
		driver.findElement(By.xpath("//input[@type='radio' and @value='1']/following-sibling::span")).click();
		Thread.sleep(2000);
		
		//click on save button
		driver.findElement(By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/descendant::button[@type='submit']")).click();
		Thread.sleep(2000);
		
		//click on employee list button
		driver.findElement(By.xpath("//a[text()='Employee List']")).click();
		Thread.sleep(2000);
		
		//enter captured employee id in employee id text box
		driver.findElement(By.xpath("//label[text()='Employee Id']/parent::div/following-sibling::div/child::input")).sendKeys(emp_id);
		Thread.sleep(2000);
		
		//click on search button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		//click on admin link
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		System.out.println("Admin button clicked");
		Thread.sleep(2000);
		
		//click on add button
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		System.out.println("Add button clicked");
		Thread.sleep(2000);
		
		//Select user role using actions class
		WebElement user = driver.findElement(By.xpath("//label[text()='User Role']/parent::div/following-sibling::div/descendant::div[@class='oxd-select-text-input']"));
		act.click(user).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
		System.out.println("user role selected");
		Thread.sleep(2000);
		
		//enter employee name and select from suggestion employee name
		WebElement en = driver.findElement(By.xpath("//label[text()='Employee Name']/parent::div/following-sibling::div/descendant::input"));
		en.sendKeys("Sa");
		Thread.sleep(3000);
		act.moveToElement(en).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
		
		//Select enabled status using actions class
		WebElement status = driver.findElement(By.xpath("//label[text()='Status']/parent::div/following-sibling::div/descendant::div[@class='oxd-select-text-input']")); 
		act.click(status).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
		//enter employee username, password and confirm password
		driver.findElement(By.xpath("//label[text()='Username']/parent::div/following-sibling::div/child::input")).sendKeys("Ramayan");
		driver.findElement(By.xpath("//label[text()='Password']/parent::div/following-sibling::div/child::input")).sendKeys("Anika123");
		driver.findElement(By.xpath("//label[text()='Confirm Password']/parent::div/following-sibling::div/child::input")).sendKeys("Anika123");
		Thread.sleep(2000);
		
		
		//click on save button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		System.out.println("login credentials created");
		
		//click on profile icon, and click on logout button
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		System.out.println("logged out");
		
		Thread.sleep(3000);
		
		//enter employee username
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Ramayan");
		
		//enter employee password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Anika123");
		
		//click on login button
		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(3000);
		
		//capture employee name
		WebElement empname = driver.findElement(By.cssSelector("[class='oxd-userdropdown-name']"));
		String name = empname.getText();
		
		System.out.println("Emloyee Name :" + empname);
		
		
		Thread.sleep(2000);
		driver.close();
		

	}

}
