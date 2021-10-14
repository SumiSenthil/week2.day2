package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnLocateElementACME {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver();
		 //MAXIMISE WINDOW
		 driver.manage().window().maximize();
		 driver.get("https://acme-test.uipath.com/login");
		 Thread.sleep(3000);
		 //Enter mail ID and password to login
		 driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		 driver.findElement(By.id("password")).sendKeys("leaf@12");	
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 //Display title and logout
		 String strTitle= driver.getTitle();
		 System.out.println(strTitle);	
		 driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		 driver.close();
	}

}
