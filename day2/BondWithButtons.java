package assignments.week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BondWithButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*
		 * driver.findElement(By.id("home")).click();
		 * System.out.println(driver.getCurrentUrl());
		 */
		Point location = driver.findElement(By.id("position")).getLocation();
		System.out.println("Location of this button is "+location);
		String cssValue = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println("The background color of this button is "+cssValue);
		Dimension size = driver.findElement(By.id("size")).getSize();
		System.out.println("Size is this button is "+size);

	}
}