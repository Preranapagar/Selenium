package Tutorial4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {
	public static void main(String[]args)throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
		//Perform Operation on first Name text box
		
		WebElement fname = driver.findElement(By.id("firstName"));
	
		boolean a = fname.isDisplayed();
		System.out.println("Firstname displayed :" + a);
		boolean b = fname.isEnabled();
		System.out.println("Firstname enabled :" + b);

		fname.sendKeys("Radha");
		
		String attrval = fname.getAttribute("value");
		System.out.println("Fname attribute value :" + attrval);
		
		//Perform Operation on last Name text box
		WebElement lname = driver.findElement(By.id("lastName"));
		
		//check text box is displayed or not?
		boolean a1 = lname.isDisplayed();
		System.out.println("Lastname displayed :" + a1);
		
		//check text box is enabled or not?
		boolean b1 = lname.isEnabled();
		System.out.println("Lastname Enabled :" + b1);
		
		//enter value in text box
		lname.sendKeys("Mahajan");
		
		//enter value in text box
		String attr = lname.getAttribute("value");
		System.out.println("LastName attrribute value " + attr);
		
		//Perform Operation on email ID text box
		
		WebElement email = driver.findElement(By.id("userEmail"));
		
		boolean a3 = email.isEnabled();
		boolean b3 = email.isDisplayed();
		
		System.out.println("Email enabled :" + a3);
		System.out.println("Email disabled :" + b3);
		
		email.sendKeys("radha@yahoo.com");
		
		String emailval = email.getAttribute("value");
		System.out.println("Email Id :" + emailval);
		
		//Perform Operation on male/female radio button
		
		WebElement gender1 = driver.findElement(By.cssSelector("label[for='gender-radio-1']"));
		WebElement gender2 = driver.findElement(By.cssSelector("label[for='gender-radio-2']"));
		
		boolean m1 = gender1.isEnabled();
		boolean f1 = gender2.isEnabled();
		boolean m2 = gender1.isDisplayed();
		boolean f2 = gender2.isDisplayed();
		
		System.out.println("Male radio button enabled :" + m1);
		System.out.println("Male radio button displayed :" + m2);
		System.out.println("Female radio button enabled :" + f1);
		System.out.println("Female radio button displayed :" + f2);
		
		gender2.click();
		
		boolean d1 = gender1.isSelected();
		boolean d2 = gender2.isSelected();
		
		System.out.println("Male radio button selected :" + d1);
		System.out.println("Female radio button selected :" + d2);
		
		//Mob number text box
		WebElement mob = driver.findElement(By.id("userNumber"));
		
		boolean e1 = mob.isEnabled();
		boolean e2 = mob.isDisplayed();
		
		System.out.println("Mob textbox is enabled :" + e1);
		System.out.println("Mob textbox is displayed :" + e2);
		
		mob.sendKeys("7865432");
		String mobnum = mob.getAttribute("value");
		System.out.println("Mob number :" + mobnum);
		
		//Perform Operation on sports check box
		
		WebElement sports = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
		
		boolean s1 = sports.isEnabled();
		boolean s2 = sports.isDisplayed();
		
		System.out.println("Sports textbox is enabled :" + s1);
		System.out.println("Sports textbox is displayed :" + s2);
		
		sports.click();
		
		boolean s3 = sports.isSelected();
		System.out.println("Sports textbox is selected :" + s3);
		
		

				
		Thread.sleep(5000);
		driver.close();
	}

}
