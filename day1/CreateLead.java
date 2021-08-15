package assignments.week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args)  {
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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Swathi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("NR");
		WebElement dropDown1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drpDwn1 = new Select(dropDown1);
		drpDwn1.selectByIndex(5);
		WebElement dropDown2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drpDwn2 = new Select(dropDown2);
		drpDwn2.selectByValue("CATRQ_CARNDRIVER");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Swath");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Mane");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mrs");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("08/4/21");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Software Engineer");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1000000");
		WebElement dropDown3 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select drpDwn3 = new Select(dropDown3);
		drpDwn3.selectByVisibleText("INR - Indian Rupee");
		WebElement dropDown4 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select drpDwn4 = new Select(dropDown4);
		drpDwn4.selectByIndex(2);
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("108");
		WebElement dropDown5 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drpDwn5 = new Select(dropDown5);
		drpDwn5.selectByValue("OWN_CCORP");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("560");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("@");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Form filled");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Nothing");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("080");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("267079");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("08172");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Swathi");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nrswathi15@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.ndtv.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Swathi NR");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Swathi");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Industrial Town");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Rajajinagar");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Bangalore");
		WebElement dropDown7 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select drpDwn7 = new Select(dropDown7);
		drpDwn7.selectByVisibleText("India");
		WebElement dropDown6 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select drpDwn6 = new Select(dropDown6);
		drpDwn6.selectByVisibleText("KARNATAKA");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("010");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("560");
		String FirstName = driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");
		System.out.println(FirstName);
		driver.findElement(By.className("smallSubmit")).click();
		String orgTitle = "View Lead | opentaps CRM";
		String title = driver.getTitle().trim();
		System.out.println(title);
		if (orgTitle.equals(title)) {
			System.out.println("In the Right place");
		} else {
			System.out.println("In the wrong place");
		}
	}
}
