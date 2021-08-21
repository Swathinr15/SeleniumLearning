package assignments.week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//label[text()='First name:'])[3]/following::input")).sendKeys("Swathi");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("(//a[text()='Edit'])")).click();
        String text = driver.findElement(By.id("updateLeadForm_companyName")).getAttribute("value");
        System.out.println(text);
        Thread.sleep(2000);
        driver.findElement(By.id("updateLeadForm_companyName")).clear();
        driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("vamika");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Update']")).click();
        Thread.sleep(2000);
        String chngTxt = driver.findElement(By.id("viewLead_companyName_sp")).getText();
        System.out.println(chngTxt);
        if(chngTxt.contains("text")) {
        	System.out.println("Company name not changed ");
        }
        else {
        	System.out.println("Company name changed successfully");
        }
        driver.close();
		}
}
