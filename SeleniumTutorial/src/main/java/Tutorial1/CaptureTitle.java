package Tutorial1;

import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureTitle {
	public static void main (String[] args) {
		
		ChromeDriver abc = new ChromeDriver();
		
		abc.get("https://www.google.com");
		
		String title = abc.getTitle();
		System.out.println(title);
	}

}
