package assignments.week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Swathi");
		driver.findElement(By.name("lastname")).sendKeys("NR");
		driver.findElement(By.name("reg_email__")).sendKeys("nrswathi15@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("abcd1");
		WebElement drpDown1 = driver.findElement(By.id("day"));
		Select drpDwn1 = new Select(drpDown1);
		drpDwn1.selectByIndex(15);
		WebElement drpDown2 = driver.findElement(By.id("month"));
		Select drpDwn2 = new Select(drpDown2);
		drpDwn2.selectByValue("7");
		WebElement drpDown3 = driver.findElement(By.id("year"));
		Select drpDwn3 = new Select(drpDown3);
		drpDwn3.selectByVisibleText("2011");
		driver.findElement(By.className("_58mt")).click();
		
		
		

	}

}
