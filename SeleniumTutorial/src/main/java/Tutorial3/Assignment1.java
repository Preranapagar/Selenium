package Tutorial3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {
	public static void main(String[]args)throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html\r\n"
				+ "");

//		- first name and last name
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Apurva");
		
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Patil");
			
//		- address
		driver.findElement(By.cssSelector("textarea[ng-model='Adress']")).sendKeys("Senapati Bapat Road");
		
//		- email address and phone number
		driver.findElement(By.cssSelector("input[ng-model='EmailAdress']")).sendKeys("apurva@gmail.com");
		driver.findElement(By.cssSelector("input[ng-model='Phone']")).sendKeys("99765424");
		
//		- gender
		driver.findElement(By.cssSelector("input[value='FeMale']")).click();
		
//		- hobbies
		driver.findElement(By.cssSelector("#checkbox2")).click();
		
//		- Skills 				-- Java
		WebElement wb = driver.findElement(By.cssSelector("select[class='form-control ng-pristine ng-untouched ng-valid']"));
		Select sel = new Select(wb);
		sel.selectByVisibleText("Java");
		
//		- Date 	
		WebElement day = driver.findElement(By.cssSelector("#daybox"));
		Select sel2 = new Select(day);
		sel2.selectByValue("3");
		
		
//		- month
		WebElement month = driver.findElement(By.cssSelector("select[ng-model='monthbox']"));
		Select sel3 = new Select(month);
		sel3.selectByVisibleText("December");
		
//		- year
		WebElement year = driver.findElement(By.cssSelector("#yearbox"));
		Select sel4 = new Select(year);
		sel4.selectByVisibleText("1995");
		
//		- password
		driver.findElement(By.cssSelector("#firstpassword")).sendKeys("RadheRadhe");
		
//		- confirm password
		driver.findElement(By.cssSelector("#secondpassword")).sendKeys("RadheRadhe");
		
//		- submit button
		driver.findElement(By.cssSelector("#submitbtn")).click();
		
		Thread.sleep(5000);
		driver.close();
	}

}
