package week2.day2;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocateElementEdit {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver();
		 //MAXIMISE WINDOW
		 driver.manage().window().maximize();
		 driver.get("http://leafground.com/pages/Edit.html");
		 Boolean eletext1= driver.findElement(By.xpath("//input[@type='text']")).isDisplayed();
		 if (eletext1==true) {
			 driver.findElement(By.id("email")).sendKeys("Yash@yahoo.com");
		}
		 
		 Boolean eletext= driver.findElement(By.xpath("//input[@value='Append ']")).isEnabled();
		 if (eletext==true) {
			 driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Hi");
		}
		 String strValue= driver.findElement(By.xpath("//input[@value='TestLeaf']")).getAttribute("value");
		 System.out.println("The message diaplyaed is:"+strValue);
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		 Boolean booltext=driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		 if (booltext==false) {
			System.out.println("The text box is disabled");
		}
	}

}
