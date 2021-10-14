package week2.day2;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnLocateElementSalesforce {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver();
		 //MAXIMISE WINDOW
		 driver.manage().window().maximize();
		 driver.get("  https://www.salesforce.com/in/form/signup/freetrial-sales/?");
		 Thread.sleep(5000);
		 driver.findElement(By.name("UserFirstName")).sendKeys("Kavi");
		 driver.findElement(By.name("UserLastName")).sendKeys("Krisi");
		 driver.findElement(By.name("UserEmail")).sendKeys("Kavi@gmail.com");
		 driver.findElement(By.name("UserTitle")).sendKeys("IT Manager");
		 driver.findElement(By.name("CompanyName")).sendKeys("Cognizant");
		 driver.findElement(By.name("CompanyEmployees")).sendKeys("1 - 15 employees");
		 driver.findElement(By.name("UserPhone")).sendKeys("987654321");
		 driver.findElement(By.name("CompanyCountry")).sendKeys("987654321");
		 Thread.sleep(3000);
		 //driver.findElement(By.xpath("//input[@id='SubscriptionAgreement']/following-sibling::div[3]")).click();
		driver.close();
	}

}
