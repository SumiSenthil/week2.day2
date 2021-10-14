package week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {


		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup(); 
			 ChromeDriver driver=new ChromeDriver();
			 //MAXIMISE WINDOW
			 driver.manage().window().maximize();
			 driver.get("http://leaftaps.com/opentaps/control/main");
			  WebElement eleUsername = driver.findElement(By.xpath("//input[@id='username']"));
			  eleUsername.sendKeys("DemoSalesManager");
			  WebElement elePassword = driver.findElement(By.xpath("//input[@id='password']"));
			  elePassword.sendKeys("crmsfa");
			  WebElement eleLogin =driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
			  eleLogin.click();
			  Thread.sleep(2000);
			  WebElement eleSubmit =driver.findElement(By.xpath("//a[contains(text(),'CRM')]"));
			  eleSubmit.click();
			 driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
			 driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
			  Thread.sleep(3000);
			
			  WebElement eleSource=driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
			  Select dropDown=new Select(eleSource);
			  dropDown.selectByIndex(2);	 
		
			  WebElement eleSource1=driver.findElement(By.xpath("//select[@id='createLeadForm_industryEnumId']"));
					  Select dropDown1=new Select(eleSource1);
					  	dropDown1.selectByValue("IND_AEROSPACE");
			  

			WebElement eleSource2=driver.findElement(By.xpath("//select[@id='createLeadForm_ownershipEnumId']"));
				Select dropDown2=new Select(eleSource2);
			  dropDown2.selectByVisibleText("Corporation");
			  driver.findElement(By.xpath("//input[@id='createLeadForm_marketingCampaignId']"));
	}
}
