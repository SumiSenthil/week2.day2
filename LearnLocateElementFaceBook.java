package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnLocateElementFaceBook {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver();
		 //MAXIMISE WINDOW
		 driver.manage().window().maximize();
		 driver.get("https://en-gb.facebook.com/");
		 Thread.sleep(2000);
		//Click New Account
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);
		 //Enter FirstName
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sneha");
		 //Enter FirstName,Email,Password
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Gaurav");
		 driver.findElement(By.name("reg_email__")).sendKeys("Sneha@gmail.com");
		 driver.findElement(By.name("reg_passwd__")).sendKeys("Run2moon");
		 //Enter Birthdate
		 WebElement day=driver.findElement(By.id("day"));
		 Select dropDown=new Select(day);
		  dropDown.selectByIndex(2);	
		  WebElement month=driver.findElement(By.id("month"));
		 Select dropDown1=new Select(month);
		  dropDown1.selectByValue("5");	
		  WebElement year= driver.findElement(By.id("year"));
		 Select dropDown2=new Select(year);
		  dropDown2.selectByVisibleText("2000");	
		  //Select Female
		 driver.findElement(By.xpath("//label[text()='Female']")).click();
	}

}
