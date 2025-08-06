package Tutorial6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.cssSelector("div#OKTab button.btn.btn-danger")).click();
		
		// alert with okay
		Alert alt = driver.switchTo().alert();
		
		String text = alt.getText();
		System.out.println(text);
		Thread.sleep(2000);
		alt.accept();
		
		//alert with okay and cancel
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Alert with OK & Cancel ']")).click();
		
		driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
		
		Alert alt2 = driver.switchTo().alert();
		String text2 = alt2.getText();
		System.out.println(text2);
		
		Thread.sleep(2000);
		alt2.dismiss();
		
		//alert with textbox
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Alert with Textbox ']")).click();
		driver.findElement(By.cssSelector("button.btn.btn-info")).click();
		
		Alert alt3 = driver.switchTo().alert();
		String text3 = alt3.getText();
		System.out.println(text3);
		
		alt3.sendKeys("Peru");
		
		Thread.sleep(2000);
		alt3.accept();
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
