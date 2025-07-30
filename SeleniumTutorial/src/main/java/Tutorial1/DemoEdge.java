package Tutorial1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoEdge {
	public static void main(String[]args) {
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.redbus.com");
	}

}
