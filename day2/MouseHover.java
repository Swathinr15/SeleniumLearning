package assignments.week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/mouseOver.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
		WebElement hover = driver.findElement(By.className("btnMouse"));
		Actions builder = new Actions(driver);
		builder.moveToElement(hover).perform();
		WebElement list1 = driver.findElement(By.xpath("//a[text()='Selenium']"));
		String attribute1 = list1.getAttribute("href");
		WebElement list2 = driver.findElement(By.xpath("//a[text()='RPA']"));
		String attribute2 = list2.getAttribute("href");
		WebElement list3 = driver.findElement(By.xpath("//a[text()='WebServices']"));
		String attribute3 = list3.getAttribute("href");
		System.out.println(attribute1);
		System.out.println(attribute2);
		System.out.println(attribute3);
		list1.click();
		driver.switchTo().alert().accept();


	}

}
