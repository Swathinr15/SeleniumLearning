package assignments.week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractWithCheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//label[text()='Select the languages that you know?']/following::input)[1]")).click();
		driver.findElement(By.xpath("(//label[text()='Select the languages that you know?']/following::input)[3]")).click();
		WebElement chkBx1 = driver.findElement(By.xpath("//label[contains(text(),'Confirm Selenium')]/following::input"));
		boolean selected1 = chkBx1.isSelected();
		System.out.println("is the checkbox selenium selected? "+selected1);
		WebElement chkBx2 = driver.findElement(By.xpath("(//label[text()='DeSelect only checked']/following::input)[2]"));
		boolean selected2 = chkBx2.isSelected();
		if(selected2 == true) {
        chkBx2.click();
        driver.findElement(By.xpath("//label[contains(text(),'Select all below')]/following::input[1]")).click();
        driver.findElement(By.xpath("//label[contains(text(),'Select all below')]/following::input[2]")).click();
        driver.findElement(By.xpath("//label[contains(text(),'Select all below')]/following::input[3]")).click();
        driver.findElement(By.xpath("//label[contains(text(),'Select all below')]/following::input[4]")).click();
        driver.findElement(By.xpath("//label[contains(text(),'Select all below')]/following::input[5]")).click();
		}
	}

}
