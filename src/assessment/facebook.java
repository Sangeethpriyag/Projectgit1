package assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Preeth Priya\\Selenium Jars\\New Browser exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	try
	{
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		WebElement linkGmail = driver.findElement(By.className("gb_e"));
		linkGmail.click();
		
		WebElement txtEmail = driver.findElement(By.xpath("//input[@type='email']"));
		txtEmail.sendKeys("sangeethpriya89");
		
		WebElement btnNext = driver.findElement(By.className("RveJvd snByac"));
		btnNext.click();
		
		WebElement txtPwd = driver.findElement(By.className("whsOnd zHQkBf"));
		txtPwd.sendKeys("9840628166");
		
		WebElement btnNxtPwd = driver.findElement(By.className("Vwe4Vb MbhUzd"));
		btnNxtPwd.click();
		
		WebElement linkInbox = driver.findElement(By.className("N bzz aHS-bnt"));
		
		if (linkInbox.isDisplayed())
			
		{
			System.out.println("Login Successful");
		}
		
		else
			
		{
			System.out.println("Login not successful");
		}
		
		
	}
	
	
	catch (Exception e) 
	{
		System.out.println("I'm Catch");
	}
	
	driver.close();
	driver.quit();

}
	
}