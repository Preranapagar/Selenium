package Tutorial12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class olxassignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.olx.in/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Thread.sleep(12000);
		
		//Click on Location drop down
		WebElement location = driver.findElement(By.xpath("//div[@data-aut-id='locationBox']"));
		location.click();
		Thread.sleep(7000);
		
		//Enter PUNE keyword in Location Text box
		location.clear();
		Thread.sleep(5000);
		location.sendKeys("Pune");
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//span[@class='_1qtOc COluN']/following-sibling::div/descendant::b[contains(text(),'Pune')]")).click();
		
	}

}
