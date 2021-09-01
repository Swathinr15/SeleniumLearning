package assignments.week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev113545.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("w6hnF2FRhwLC");
		driver.findElement(By.id("sysverb_login")).click();
		driver.switchTo().defaultContent();
		WebElement search = driver.findElement(By.id("filter"));
		search.sendKeys("incident");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='All'])[2]")).click();
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//button[text()='New']")).click();
		driver.findElement(By.id("lookup.incident.caller_id")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowHandlesList = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowHandlesList.get(1));
		Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[@class='glide_ref_item_link'])[1]")).click();
        driver.switchTo().window(windowHandlesList.get(0));
        driver.switchTo().defaultContent();
		//Thread.sleep(2000);
		//driver.switchTo().frame("AC.incident.short_description_shim");
        driver.switchTo().frame("gsft_main");
        driver.findElement(By.xpath("//input[@id='incident.short_description']")).sendKeys("automation testing");
        //driver.switchTo().defaultContent();
        String text = driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value");
      driver.findElement(By.xpath("//button[text()='Submit']")).click();
		WebElement search1 = driver.findElement(By.xpath("//input[@class='form-control']"));
		search1.sendKeys(text);
		search1.sendKeys(Keys.ENTER);
		String text2 = driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();
		if(text.equals(text2)) {
			System.out.println("Incident created successfully");
		}
		else
			System.out.println("incident creation failed");
		
		 //driver.switchTo().defaultContent();
		
	}

}
