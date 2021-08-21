package assignments.week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnListboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement dropDn1 = driver.findElement(By.id("dropdown1"));
		Select drpDn1 = new Select(dropDn1);
		drpDn1.selectByIndex(1);
		WebElement dropDn2 = driver.findElement(By.name("dropdown2"));
		Select drpDn2 = new Select(dropDn2);
		drpDn2.selectByVisibleText("Appium");
		WebElement dropDn3 = driver.findElement(By.id("dropdown3"));
		Select drpDn3 = new Select(dropDn3);
		drpDn3.selectByValue("3");
		WebElement dropDn4 = driver.findElement(By.xpath("//option[text()='Get the number of dropdown options']/.."));
		Select drpDn4 = new Select(dropDn4);
		int size = drpDn4.getOptions().size();
		System.out.println("size of dropdown4 is " + size);
		driver.findElement(By.xpath("//option[text()='You can also use sendKeys to select']/.."))
				.sendKeys("loadrunner");
		WebElement dropDn5 = driver.findElement(By.xpath("//option[text()='Select your programs']/.."));
		Select drpDn5 = new Select(dropDn5);
		drpDn5.selectByIndex(2);
		drpDn5.selectByIndex(3);
	}

}
