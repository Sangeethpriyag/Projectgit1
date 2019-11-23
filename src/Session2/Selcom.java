package Session2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selcom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Preeth Priya\\Selenium Jars\\New Browser exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
					
		driver.get("https://www.google.com");
		
		//driver.manage().window().maximize();
		
		Dimension dim = driver.manage().window().getSize();
		System.out.println(dim.height);
		System.out.println(dim.width);
		
		//driver.manage().window().setSize(new Dimension(360, 640));
		
		driver.navigate().refresh();
		
		WebElement btnSignIn = driver.findElement(By.id("gb_70"));
		
		//btnSignIn.clear();
		String btnText = btnSignIn.getText();
		System.out.println(btnText);
		
		System.out.println(btnSignIn.getTagName());
		System.out.println(btnSignIn.getAttribute("Id"));
		
		
		btnSignIn.click();
		
		System.out.println("Pass1");
		
		driver.navigate().back();
		System.out.println("Pass2");
		
		driver.navigate().forward();
		System.out.println("Pass3");
		
		driver.navigate().to("https://www.facebook.com");
		System.out.println("Pass4");
		
		driver.navigate().refresh();
		System.out.println("Pass5");
		
		driver.close();
		
		driver.quit();
		
	}

}
