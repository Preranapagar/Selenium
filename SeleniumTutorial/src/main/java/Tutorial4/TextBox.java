package Tutorial4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {
	public static void main(String[]args) {
		//operation on text box
		
		//Open  a chrome Browser

		WebDriver web = new ChromeDriver();
		web.manage().window().maximize();
		
		web.get("https://www.facebook.com/reg");
		
		//locate / find the first name text box
		
		WebElement wb1 = web.findElement(By.name("firstname"));
		
		//check first name is displayed or not
		
		boolean display = wb1.isDisplayed();
		
		System.out.println(display);
		
		//check first name is enabled or not
		
		boolean enable = wb1.isEnabled();
		
		System.out.println(enable);
		
		wb1.sendKeys("Anjali");
		
		String text = wb1.getAttribute("value");
		System.out.println(text);
		
		wb1.clear();
	}

}
