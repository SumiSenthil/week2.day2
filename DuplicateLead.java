package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver();
		 //MAXIMISE WINDOW
		 driver.manage().window().maximize();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		  WebElement eleUsername = driver.findElement(By.name("USERNAME"));
		  eleUsername.sendKeys("DemoSalesManager");
		  WebElement elePassword = driver.findElement(By.name("PASSWORD"));
		  elePassword.sendKeys("crmsfa");
		  //driver.findElement(By.id("password")).sendKeys("hello"); single line code
		  WebElement eleLogin =driver.findElement(By.className("decorativeSubmit"));
		  eleLogin.click();
		  Thread.sleep(2000);
		  WebElement eleSubmit =driver.findElement(By.linkText("CRM/SFA"));
		  eleSubmit.click();
		  driver.findElement(By.linkText("Leads")).click();
		  driver.findElement(By.linkText("Find Leads")).click();
		  driver.findElement(By.linkText("Email")).click();
		  driver.findElement(By.xpath("(//input[@name='emailAddress'])")).sendKeys("indira@gmail.com");
		  driver.findElement(By.xpath("(//button[text()='Find Leads'])")).click();
		  Thread.sleep(3000);
		  
		  WebElement findElement3 = driver.findElement(By.xpath("//span[text()='Lead List']/following::table[2]/tbody/tr/td[1]/div/a"));
			String title = driver.getTitle();			
			System.out.println("Title is "+title);			
			findElement3.click();
			Thread.sleep(1000);
			
		  driver.findElement(By.linkText("Duplicate Lead")).click();
		  String strTitle= driver.getTitle();
		  System.out.println(strTitle);		  	            
		  if (strTitle.contains("Duplicate Lead")) {
			System.out.println("Title is displayed as expected");
		} 
		  else
		  {
				System.out.println("Title is not displayed as expected");
			} 
		  driver.findElement(By.xpath("(//input[@class='smallSubmit'])")).click();
		  String strName = driver.findElement(By.id("viewLead_firstName_sp")).getText(); 
		  if (strName.contains("hava")) {
				System.out.println("Duplicate name is created");
			} 
			  else
			  {
					System.out.println("Duplicate name is not created");
				} 
		  driver.findElement(By.linkText("Logout")).click();
		  Thread.sleep(2000);
		 driver.close();
	}

}
