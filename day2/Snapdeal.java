package assignments.week4.day2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
WebElement hover = driver.findElement(By.xpath("//li[@navindex='6']//span"));
Actions builder=new Actions(driver);
builder.moveToElement(hover).perform();
Thread.sleep(1500);
driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
Thread.sleep(1500);
String text = driver.findElement(By.className("category-count")).getText();
System.out.println("There are"+text+"in sports shoes");
driver.findElement(By.xpath(" //div[text()='Training Shoes']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
Thread.sleep(1500);
driver.findElement(By.xpath("//li[@data-sorttype='plth']")).click();
WebElement shoes = driver.findElement(By.xpath("(//picture[@class='picture-elem'])[2]//img"));
shoes.click();
Set<String> windowHandles1 = driver.getWindowHandles();
List<String> windowHandlesList1 = new ArrayList<String>(windowHandles1);
for(int i=0;i<windowHandlesList1.size();i++) {
	 driver.switchTo().window(windowHandlesList1.get(i));
}
WebElement Screenshot = driver.findElement(By.xpath("//img[@slidenum='0']"));
File source= Screenshot.getScreenshotAs(OutputType.FILE);
File destination = new File("./snaps/shoes1.png");
FileUtils.copyFile(source, destination);
driver.switchTo().window(windowHandlesList1.get(0));

int size = driver.findElements(By.xpath("//span[@class='lfloat product-price']")).size();
System.out.println(size);
List<Integer> list = new ArrayList<Integer>();

for(int i=1;i<=size;i++) {
	String price = driver.findElement(By.xpath("(//span[@class='lfloat product-price'])["+i+"]")).getText().replaceAll("[^0-9]", "");
	    int val_Price = Integer.parseInt(price);
	    list.add(val_Price);
	    Thread.sleep(3000);
	    
}
List<Integer> sorted = new ArrayList<Integer>(list);
System.out.println(list);
Collections.sort(sorted);
//System.out.println(sorted);

 if(list.equals(sorted)==true) {
	 System.out.println("Arranged as expected");
 }
 else
	 System.out.println("items Not sorted");
WebElement hoverProduct = driver.findElement(By.xpath("//p[text()='Columbus White Training Shoes']"));
 builder.moveToElement(hoverProduct).perform();
 Thread.sleep(500);
 driver.findElement(By.xpath("(//div[contains(@class,'center quick-view-bar')])[4]")).click();
 Set<String> windowHandles = driver.getWindowHandles();
 List<String> windowHandlesList = new ArrayList<String>(windowHandles);
 for(int i=0;i<windowHandlesList.size();i++) {
	 driver.switchTo().window(windowHandlesList.get(i));
 }
 String item_price = driver.findElement(By.className("payBlkBig")).getText();
 String discount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
 System.out.println(item_price);
 System.out.println(discount);
	/*
	 * WebElement Screenshot = driver.findElement(By.xpath("//img[@slidenum='1']"));
	 * File src = Screenshot.getScreenshotAs(OutputType.FILE); File dest = new
	 * File("./snaps/Shoe"); FileUtils.copyFile(src, dest);
	 */
 for (String eachHandle : windowHandlesList) {
	 driver.switchTo().window(eachHandle);
	driver.close();
}
 
 
	}
	

}
