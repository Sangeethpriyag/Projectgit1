package Session2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Preeth Priya\\Selenium Jars\\New Browser exe\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//1. get command
				
	driver.get("https://www.facebook.com");
	
	//2. page title command
		
	String pagetitle = driver.getTitle();
	System.out.println(pagetitle);
	
	//3. get current url
	
	String currenturl = driver.getCurrentUrl();
	System.out.println(currenturl);
	
	//4. page source
	
	String pagesource = driver.getPageSource();
	System.out.println(pagesource);
	
	//5. total no of chars in page source
	
	int sizepage = pagesource.length();
	System.out.println(sizepage);
	
	//6.
	driver.navigate().to("https://wwww.youtube.com");
	
		
	driver.close();
	driver.quit();
	}

}
