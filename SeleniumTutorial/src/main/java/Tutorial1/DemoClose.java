
package Tutorial1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClose {
	
	public static void main(String[]args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		//capture title
		String title = driver.getTitle();
		System.out.println(title);
		
		//capture url
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//close window
		driver.close();
		
		//terminate the session
		driver.quit();
		
	}

}
