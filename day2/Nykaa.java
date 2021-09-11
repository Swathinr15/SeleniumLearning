package assignments.week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {
	static String title;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement hoverBrand = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(hoverBrand).perform();
		WebElement hoverPopular = driver.findElement(By.xpath("//a[text()='Popular']"));
		builder.moveToElement(hoverPopular).perform();
		driver.findElement(By.xpath("(//ul[@class='l-vertical-list']//a)[5]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowHandlesList = new ArrayList<String>(windowHandles);
		List<String> titleList = new ArrayList<String>();

		for (int i = 0; i < windowHandlesList.size(); i++) {
			String title = driver.switchTo().window(windowHandlesList.get(i)).getTitle();
			titleList.add(title);
		}
		for (int j = 0; j < titleList.size(); j++) {
			if (j == titleList.size() - 1) {
				String title = titleList.get(j);
				if (title.contains("L'Oreal")) {
					System.out.println("Correct Page");
				} else
					System.out.println("Wrong place");

			}

		}
		driver.findElement(By.xpath("//span[contains(text(),'Sort By')]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[text()='Category']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		String text = driver.findElement(By.xpath("//ul[@class='pull-left applied-filter-lists']/li")).getText();
		if (text.contains("Shampoo")) {
			System.out.println("Yes!Its Shampoo");
		} else
			System.out.println("No!Its not Shampoo");
		driver.findElement(By.xpath("//span[contains(text(),'Colour Protect Shampoo')]")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> windowHandlesList2 = new ArrayList<String>(windowHandles2);
           for (int i = 0; i < windowHandlesList2.size(); i++) {
	    driver.switchTo().window(windowHandlesList2.get(i));
		}
		WebElement dropDwn = driver.findElement(By.xpath("//div[@class='select-style shade-select']/select"));
		dropDwn.click();
		Select drpDn = new Select(dropDwn);
		drpDn.selectByVisibleText("175ml");
		Thread.sleep(1500);
		String mrp = driver.findElement(By.xpath("//span[text()='MRP:']/following::span/span")).getText();
        System.out.println(mrp);
        driver.findElement(By.xpath("//span[@class='mkr-New-Shopping-Bag font-mkr']/..")).click();
        Thread.sleep(1500);
        driver.findElement(By.className("AddBagIcon")).click();
        Set<String> windowHandles3 = driver.getWindowHandles();
		List<String> windowHandlesList3 = new ArrayList<String>(windowHandles3);
           for (int i = 0; i < windowHandlesList3.size(); i++) {
	    driver.switchTo().window(windowHandlesList3.get(i));
		}
           String grandTotal = driver.findElement(By.xpath("//span[text()='Grand Total']/../div")).getText();
        System.out.println(grandTotal);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='btn full fill no-radius proceed ']/span/span")).click();
 
        Set<String> windowHandles4 = driver.getWindowHandles();
		List<String> windowHandlesList4 = new ArrayList<String>(windowHandles4);
           for (int i = 0; i < windowHandlesList4.size(); i++) {
	    driver.switchTo().window(windowHandlesList4.get(i));
		}
        driver.findElement(By.xpath("//button[text()='CONTINUE AS GUEST']")).click();
        Set<String> windowHandles5 = driver.getWindowHandles();
		List<String> windowHandlesList5 = new ArrayList<String>(windowHandles5);
           for (int i = 0; i < windowHandlesList5.size(); i++) {
	    driver.switchTo().window(windowHandlesList5.get(i));
		}
        String finalTotal = driver.findElement(By.xpath("//div[text()='Grand Total']/following-sibling::div")).getText();
        System.out.println(finalTotal);
        if(grandTotal.equals(finalTotal)) {
        	System.out.println("yes grandTotal is same");
        }
        else
        	System.out.println("GrandTotal doesn't match");
 //       Set<String> windowHandles6 = driver.getWindowHandles();
        System.out.println("inside");
        
        for(String handle : driver.getWindowHandles()) {
                driver.switchTo().window(handle);
                driver.close();
          
		}
        
	}
	

}
