package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocateElementCheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver();
		 //MAXIMISE WINDOW
		 driver.manage().window().maximize();
		 driver.get("http://leafground.com/pages/checkbox.html");
		 Thread.sleep(1000);
		 //Select VB,SQL,C
		 driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		 driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		 driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
		 //Check Checkbox is selected or nor
		 Boolean boolCheckBox = driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).isSelected();
		 if (boolCheckBox==true) {
			 System.out.println("The Selenium Check box is selected");
		}
		 else
		 { System.out.println("The Selenium Check box is notselected");}
		 
		 //Deselect the check box
		 driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
		 //select all the check box
		 driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
		 driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
		 driver.findElement(By.xpath("(//input[@type='checkbox'])[11]")).click();
		 driver.findElement(By.xpath("(//input[@type='checkbox'])[12]")).click();



	}

}
