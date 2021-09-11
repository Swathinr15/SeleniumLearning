package testcase;


import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week5.day1.ReadExcel;

public class CreateLead extends CommonClass {
@Test(dataProvider="sendData")
	public void runCreateLead(String firstName,String lastName,String company,String phoneNumber) {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phoneNumber);
		driver.findElement(By.name("submitButton")).click();
		
}
@DataProvider
public String[][] sendData() throws IOException {
		return ReadExcel.readFile("CreateLeadExcel");

}

}






