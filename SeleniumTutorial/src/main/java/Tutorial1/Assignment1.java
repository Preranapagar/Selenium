package Tutorial1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		
		//open wikipedia url
		driver.get("https://www.wikipedia.com");
		
		//capture title
		String title = driver.getTitle();
		System.out.println(title);
		
		//navigate to Facebook url
		driver.navigate().to("https://www.facebook.com");
		
		//capture url
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//navigate back
		driver.navigate().back();
		
		//capture url
		String url2 = driver.getCurrentUrl();
		System.out.println(url2);
		
		//navigate forward
		driver.navigate().forward();
		
		//capture title
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		//refresh page
		driver.navigate().refresh();
		
		//close window
		driver.close();
		
		//terminate session
		driver.quit();
		
		
		
		
		
	}

}
