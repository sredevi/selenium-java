package selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTours {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srede\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\www.amazon.com");
		String title=driver.getTitle();
		System.out.println("Title of the page: "+title);
		driver.findElement(By.id("nav-hamburger-menu")).click();
		driver.findElement(By.id("hmenu-customer-name")).click();
		driver.close();
		driver.quit();
	}

}
