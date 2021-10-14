package week2.day2;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocateElementLink {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver();
		 //MAXIMISE WINDOW
		 driver.manage().window().maximize();
		 driver.get("http://leafground.com/pages/Link.html");
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Go to Home Page']")).click();
		Thread.sleep(1000);
		Boolean eleHome=driver.findElement(By.xpath("//img[@alt='logo Testleaf']")).isDisplayed();
		 
		 if (eleHome==true) {
			 System.out.println("Home Page is displayed");
		}
		 else
		 {
			 System.out.println("Home Page is not displayed");
		}
		 driver.get("http://leafground.com/pages/Link.html");
		 Thread.sleep(1000);		 
		 String elehref = driver.findElement(By.xpath("//a[text()='Find where am supposed to go without clicking me?']")).getAttribute("href");
		 System.out.println("The reference is : "+elehref);
		 driver.findElement(By.xpath("//a[text()='Go to Home Page']"));
		 int size = driver.findElements(By.tagName("a")).size(); 
	        System.out.println("Number of Links in Page :" +size);
		 driver.findElement(By.xpath("//a[text()='Verify am I broken?']")).click();
		 Boolean boolstr=driver.findElement(By.xpath("//h1[contains(text(),'HTTP Status 404')]")).isDisplayed();
		 Thread.sleep(1000);
		 if (boolstr==true) {
			 System.out.println("The link Verify am I broken is broken Link");
		}
		 else
		 {
			 System.out.println("The link Verify am I broken is not broken Link");
		}
		 
	}

}
