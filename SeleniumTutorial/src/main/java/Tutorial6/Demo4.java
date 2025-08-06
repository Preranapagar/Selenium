package Tutorial6;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo4 {
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		//alert button 1
		
		driver.findElement(By.cssSelector("#alertButton")).click();
		
		
	}
	
}
