package Tutorial6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Facebook:");
		driver.get("https://www.facebook.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);

	}

}
