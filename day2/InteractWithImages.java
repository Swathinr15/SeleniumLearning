package assignments.week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractWithImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriverManager.chromedriver().setup();
       ChromeDriver driver = new ChromeDriver();
       driver.get("http://leafground.com/pages/Image.html");
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      //driver.findElement(By.xpath("//label[text()='Click on this image to go home page']/following-sibling::img")).click();
      //System.out.println(driver.getCurrentUrl());
       String link = driver.findElement(By.xpath("//label[text()='Am I Broken Image?'] /following-sibling::img")).
       getAttribute("src");
       driver.get(link);
       String title = driver.getTitle();
       if(title.contains("404")) {
    	   System.out.println("the image is broken");
       }
       else
    	   System.out.println("not a broken image");
}
}