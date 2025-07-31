package Tutorial2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	public static void main(String[]args)throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		//maximize browser
		
		driver.manage().window().maximize();

		Thread.sleep(5000);
		
		// minimize browser
		
		driver.manage().window().minimize();
		
		//fullscreen browser
		Thread.sleep(5000);
		
		driver.manage().window().fullscreen();
		
		//set browser dimensions
		
		Dimension d = new Dimension(200,500);
		
		driver.manage().window().setSize(d);
		
		
	}

}
