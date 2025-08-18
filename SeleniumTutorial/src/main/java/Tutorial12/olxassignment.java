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
		WebElement location = driver.findElement(By.xpath("//input[starts-with(@placeholder,'Search')]"));
		location.click();
		Thread.sleep(7000);
		
		//Enter PUNE keyword in Location Text box
		location.clear();
		Thread.sleep(5000);
		location.sendKeys("Pune");
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//span[@class='_1qtOc COluN']/following-sibling::div/descendant::b[contains(text(),'Pune')]")).click();
		Thread.sleep(5000);
		
		//On Search Box search Car keyword and select suggested 1st car
		driver.findElement(By.cssSelector("[data-aut-id='searchBox']")).sendKeys("Car");
		Thread.sleep(7000);
		
		WebElement suggestedListFirstOption = driver.findElement(By.xpath("//li[@data-aut-id='searchSuggestionItem'][1]/child::div/descendant::span[text()='Cars']"));
		
		suggestedListFirstOption.click();
		Thread.sleep(20000);
		
		//Scroll down to brands
		Actions act = new Actions(driver);
		Thread.sleep(7000);
		WebElement allModels = driver.findElement(By.xpath("//div[text()='All Models']"));
		act.scrollToElement(allModels).build().perform();
		
		Thread.sleep(4000);
		WebElement allBrands = driver.findElement(By.xpath("//div[text()='All Brands']/following-sibling::div[contains(@class,'_3Ez9F')]"));
		act.moveToElement(allBrands).click().sendKeys(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(4000);
		WebElement bmw = driver.findElement(By.xpath("//input[@id='c-make-bmw']"));
		bmw.click();
		
		Thread.sleep(4000);
		
		WebElement year = driver.findElement(By.xpath("//span[text()='Year']"));
		act.scrollToElement(year).build().perform();
		
		Thread.sleep(4000);
		
		WebElement src1 = driver.findElement(By.xpath(
				"//span[text()='Budget']/parent::div/following-sibling::div/descendant::div[@class='rc-slider-handle rc-slider-handle-1' and @aria-valuenow='0']"));
		
		act.clickAndHold(src1).moveByOffset(50,0).release().build().perform();
		
		Thread.sleep(2000);
		
		WebElement src2 = driver.findElement(By.xpath("//span[text()='Budget']/parent::div/following-sibling::div/descendant::div[@class='rc-slider-handle rc-slider-handle-2']"));
		act.clickAndHold(src2).moveByOffset(-20,0).release().build().perform();


		
		}

}
