package assignments.week3.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement searchValue = driver.findElement(By.name("searchVal"));
		searchValue.sendKeys("bags");
		searchValue.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		Thread.sleep(3000);
        String text = driver.findElement(By.className("length")).getText();
        System.out.println(text);
        System.out.println("The following are brandnames details");
        List<WebElement> brandName = driver.findElements(By.className("brand"));
        int size = brandName.size();
        System.out.println("List size of brand is "+size);
        for (WebElement brand : brandName) {
			  String text2 = brand.getText();
              System.out.println(text2);
              }
        System.out.println("The following are bagnames details");
        List<WebElement> bagName = driver.findElements(By.className("name"));
        int size2 = bagName.size();
        System.out.println("List size of bagname is "+size2);
        for (WebElement name : bagName) {
        	String text2 = name.getText();
        	System.out.println(text2);
			
		}
	}
}
