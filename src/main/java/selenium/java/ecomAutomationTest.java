package selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ecomAutomationTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srede\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//String url="http://shop.demoqa.com";
		WebDriver driver=new ChromeDriver();
		driver.get("http://shop.demoqa.com/");
		WebElement message=driver.findElement(By.xpath("html/body/p"));
		System.out.println(message.getText());
		//xpath
		driver.findElement(By.xpath("html/body/p/a")).click();
		//className
		driver.findElement(By.className("woocommerce-store-notice__dismiss-link")).click();
		//linkText
		driver.findElement(By.linkText("Dismiss")).click();
		//partiallink
		driver.findElement(By.partialLinkText("miss")).click();
		//tagName
		driver.findElement(By.tagName("a")).click();
		//Relative and Absolute XPATHs
		//Relative XPATH: 
		//driver.close();
		//driver.quit();
	}

}
