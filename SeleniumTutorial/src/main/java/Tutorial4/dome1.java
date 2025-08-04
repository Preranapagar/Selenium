package Tutorial4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dome1 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
		
		WebElement wb3 = driver.findElement(By.cssSelector("label[for='gender-radio-1']"));
        boolean a4=wb3.isDisplayed();
        System.out.println(a4);
        boolean a5=wb3.isEnabled();
        System.out.println(a5);
        boolean b3=wb3.isEnabled();
        System.out.println(b3);
        boolean c3=wb3.isSelected();
        System.out.println(c3);
        wb3.click();
        boolean c5=wb3.isSelected();
        System.out.println(c5);
		
		driver.close();
		
	}

}
