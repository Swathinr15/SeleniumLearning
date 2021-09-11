package assignments.week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Droppable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriverManager.chromedriver().setup();
       ChromeDriver driver = new ChromeDriver();
       driver.get("https://jqueryui.com/droppable/");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
       WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
       driver.switchTo().frame(frame1);
       WebElement draggable = driver.findElement(By.id("draggable"));
       WebElement droppable = driver.findElement(By.id("droppable"));
       Actions builder = new Actions(driver);
       builder.dragAndDrop(draggable, droppable).perform();
       driver.switchTo().defaultContent();
       
	}

}
 