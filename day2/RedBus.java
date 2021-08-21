package assignments.week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement source = driver.findElement(By.id("src"));
		source.sendKeys("Chennai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-id='123']")).click();
		WebElement dest = driver.findElement(By.id("dest"));
		dest.sendKeys("Bengaluru");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='autoFill']/li")).click();
		driver.findElement(By.xpath("//td[@class='next']/button")).click();
		driver.findElement(By.xpath("//td[@class='next']/button")).click();
		driver.findElement(By.xpath("//td[text()='15']")).click();
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@class='icon icon-close c-fs']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//i[@class='icon icon-close']")).click();
		//Thread.sleep(1000);
		String text1 = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("Number of Buses available " +text1);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[text()='SLEEPER']/preceding-sibling::label")).click();
		String text2 = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("Number of Buses available in sleeper " +text2);
		driver.findElement(By.xpath("//label[text()='SLEEPER']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='AC']")).click();
		String text3 = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("Number of Buses available in AC " +text3);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[text()='NONAC']")).click();
		String text4 = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("Number of Buses available in AC and nonAC " +text4);
		
		
	}

}
