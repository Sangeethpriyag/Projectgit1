package Session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumKickStart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Preeth Priya\\Selenium Jars\\New Browser exe\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		int a = 2;
		try
		{
			int b = 3;  //local variable to try

		driver.manage().window().maximize();
		System.out.println("Step 1");
		
		driver.get("https:\\www.google.com");
		System.out.println("Step 2");
		
		WebElement txtSearch = driver.findElement(By.name("q"));
		txtSearch.sendKeys("Success");
		
		Thread.sleep(5000);		
		
		} catch (Exception e) {
			System.out.println("I'm Catch");
			// TODO: handle exception
		}
		System.out.println(a);
	
		driver.close();
		driver.quit();
	}

}
