package selenium.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyLibrary 
{
	public static WebDriver LaunchChrome() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\srede\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	return driver;}
	
	public static WebDriver LaunchChrome(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srede\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		return driver;}
	
	public static void ClearandTypeValue(WebElement element, String value)
	{
		element.clear();
		element.sendKeys(value);
	}
	}
