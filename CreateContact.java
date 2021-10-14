package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver();
		 //MAXIMISE WINDOW
		 driver.manage().window().maximize();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 //Login into Link
		  WebElement eleUsername = driver.findElement(By.name("USERNAME"));
		  eleUsername.sendKeys("DemoSalesManager");
		  WebElement elePassword = driver.findElement(By.name("PASSWORD"));
		  elePassword.sendKeys("crmsfa");
		  Thread.sleep(1000);		  
		  WebElement eleLogin =driver.findElement(By.className("decorativeSubmit"));
		  eleLogin.click();
		  Thread.sleep(1000);
		  //Click on CRM Link
		  WebElement eleSubmit =driver.findElement(By.linkText("CRM/SFA"));
		  eleSubmit.click();
		  Thread.sleep(1000);
		  //create contact
		  driver.findElement(By.linkText("Contacts")).click();
		  driver.findElement(By.linkText("Create Contact")).click();		  
		  driver.findElement(By.id("firstNameField")).sendKeys("TestLeaf");
		  driver.findElement(By.id("lastNameField")).sendKeys("Sumathi");		 
		  driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Gana");
		  driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("pathi");
		  driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Automobile");
		  driver.findElement(By.id("createContactForm_description")).sendKeys("Contact Address");		
		  driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("priya@gmail.com");
		  driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")).sendKeys("Georgia");     
		  Thread.sleep(2000);
		  driver.findElement(By.className("smallSubmit")).click();
		  driver.findElement(By.linkText("Edit")).click();
		  Thread.sleep(2000);
		  //update the description
		  driver.findElement(By.id("updateContactForm_description")).clear();
		  driver.findElement(By.id("updateContactForm_description")).sendKeys("update Address");
		  driver.findElement(By.xpath("(//input[@class='smallSubmit'])")).click();
		 Thread.sleep(2000);
		 //Print title 
		  String strTitle= driver.getTitle();
		  System.out.println(strTitle);	 	
		  
		 driver.findElement(By.linkText("Logout")).click();
		  Thread.sleep(2000);
		 driver.close();
	}

}
