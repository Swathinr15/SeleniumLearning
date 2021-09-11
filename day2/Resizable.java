package assignments.week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resizable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resizable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame1);
		//WebElement rightSide = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-e']"));
		//Actions builder = new Actions(driver);
		//builder.clickAndHold(rightSide).moveToElement(rightSide, 140, 90).release().perform();
		WebElement bottom = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-s']"));
		Actions builder = new Actions(driver);
        builder.clickAndHold(bottom).moveToElement(bottom,20,25).release().perform();
        //WebElement corner = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		//Actions builder = new Actions(driver);
        //builder.clickAndHold(corner).moveToElement(corner,20,25).release().perform();
		driver.switchTo().defaultContent();

	}

}
