package Tutorial2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	public static void main(String[]args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		//open a new Tab
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		//Open new Window
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.close();
		
		
	}

}
