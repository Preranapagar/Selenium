package Tutorial1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	public static void main(String[]args) {
		
		//capture the browser URL
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.com");
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
	}

}
