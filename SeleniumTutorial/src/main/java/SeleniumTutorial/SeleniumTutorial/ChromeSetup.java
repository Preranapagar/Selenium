package SeleniumTutorial.SeleniumTutorial;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeSetup {
	public static void main(String[] args) {
		
		ChromeDriver abc = new ChromeDriver();
		
		abc.get("https://www.facebook.com");
	}
}
