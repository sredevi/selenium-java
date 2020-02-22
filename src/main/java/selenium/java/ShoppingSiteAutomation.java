package selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingSiteAutomation {

	public static void main(String[] args) {
//Retrieve the Address, Telephone and Email ID from toolqa shopping site
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srede\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://shop.demoqa.com");
		WebElement address=driver.findElement(By.tagName("address"));
		System.out.println("A "+address.getText());
		//WebElement telephone=driver.findElement(By.xpath(".//span[text()='T']//following-sibling::a"));
		WebElement telephone=driver.findElement(By.xpath("//span[text()='T']/../a"));
		System.out.println("T "+ telephone.getText());
		WebElement mail=driver.findElement(By.className("phone-text"));
		System.out.println("M "+mail.getText());
		driver.close();
		driver.quit();		
	}

}
