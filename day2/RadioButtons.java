   package assignments.week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("yes")).click();
		boolean enabled = driver.findElement(By.xpath("//label[@for='Checked']")).isEnabled();
		System.out.println("is the radio button checked is enabled? " +enabled);
		WebElement ageElement = driver.findElement(By.xpath("//label[contains(text(),'Select your age group')]/following::input[2]"));
		if(!ageElement.isSelected()) {
			ageElement.click();
		}
		boolean enabled2 = ageElement.isEnabled();
		System.out.println("is the radio button checked is enabled? " +enabled2);
		
	}

}
