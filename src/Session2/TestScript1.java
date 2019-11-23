package Session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Preeth Priya\\Selenium Jars\\New Browser exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		try
		
		{
			
			driver.manage().window().maximize();
			
			driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
			
			WebElement txtFirstName = driver.findElement(By.name("first_name"));
			txtFirstName.sendKeys("John");
			
			WebElement txtLastName = driver.findElement(By.name("last_name"));
			txtLastName.sendKeys("Smith");

			WebElement txtEMail = driver.findElement(By.name("email"));
			txtEMail.sendKeys("test@abc.com");
			
			WebElement txtPhone = driver.findElement(By.name("phone"));
			txtPhone.sendKeys("(123)456-7890");
			
			WebElement txtAddress = driver.findElement(By.xpath("//input[@name='address']"));
			txtAddress.sendKeys("No 1 Wood street");
			
			WebElement txtCity = driver.findElement(By.name("city"));
			txtCity.sendKeys("Chennai");
			
			//WebElement txtState = driver.findElement(By.name("state"));
			//txtEMail.sendKeys("Tamilnadu");
			
			WebElement txtZip = driver.findElement(By.name("zip"));
			txtZip.sendKeys("600021");
			
			WebElement txtWebName = driver.findElement(By.name("website"));
			txtWebName.sendKeys("www.google.com");
			
			Thread.sleep(5000);		
			
		} catch (Exception e) 
			{
				System.out.println("I'm Catch");
			// TODO: handle exception
			}
			
			driver.close();
			driver.quit();
			
		}

	}
