package assignments.week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlayWithHyperLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("(//a[contains(text(),'Home Page')])[1]")).click();
		String str = driver.findElement(By.xpath("//a[contains(text(),'without click')]")).getAttribute("href");
		System.out.println(str);
		String str1 = driver.findElement(By.xpath("(//a[contains(text(),'Home Page')])[1]")).getAttribute("href");
		String str2 = driver.findElement(By.xpath("(//a[contains(text(),'Home Page')])[2]")).getAttribute("href");
		System.out.println(str1);
		System.out.println(str2);
		if (str1.equals(str2)) {
			driver.findElement(By.xpath("(//a[contains(text(),'Home Page')])[1]")).click();
		}
		System.out.println(driver.getCurrentUrl());

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("The number of links is " + links.size());

		driver.findElement(By.xpath("//a[text()='Verify am I broken?']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("404")) {
			System.out.println("This is a broken link");
		} else
			System.out.println("Not a broken link");

	}

}
