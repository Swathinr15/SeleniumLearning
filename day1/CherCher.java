package assignments.week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CherCher {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver= new ChromeDriver();
driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.switchTo().frame("frame1");
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("MyFrame");
driver.switchTo().frame("frame3");
driver.findElement(By.id("a")).click();
driver.switchTo().defaultContent();
driver.switchTo().frame("frame2");
WebElement drpDwn1 = driver.findElement(By.id("animals"));
Select drpDn1 = new Select(drpDwn1);
drpDn1.selectByValue("babycat");
Thread.sleep(1000);
driver.switchTo().defaultContent();

	}

}
