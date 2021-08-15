package assignments.week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("UserFirstName")).sendKeys("Swathi");
		driver.findElement(By.name("UserLastName")).sendKeys("NR");
		driver.findElement(By.name("UserEmail")).sendKeys("nrswathi15@gmail.com");
		WebElement dropDown1 = driver.findElement(By.name("UserTitle"));
		Select drpDwn1 = new Select(dropDown1);
		drpDwn1.selectByIndex(2);
		driver.findElement(By.name("CompanyName")).sendKeys("Henko");
		WebElement dropDown2 = driver.findElement(By.name("CompanyEmployees"));
		Select drpDwn2 = new Select(dropDown2);
		drpDwn2.selectByValue("75");
		driver.findElement(By.name("UserPhone")).sendKeys("0804422160");
		WebElement dropDown3 = driver.findElement(By.name("CompanyCountry"));
		Select drpDwn3 = new Select(dropDown3);
		drpDwn3.selectByVisibleText("India");
		driver.findElement(By.className("checkbox-ui")).click();
		driver.close();

	}

}
