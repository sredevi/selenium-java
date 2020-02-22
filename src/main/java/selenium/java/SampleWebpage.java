package selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SampleWebpage {

	public static void main(String[] args) {
		WebDriver driver=MyLibrary.LaunchChrome("https://www.testandquiz.com/selenium/testing.html");
	WebElement title = driver.findElement(By.xpath("//div[@class='col-md-offset-2 col-md-8']"));
	System.out.println("Title: " + title.getText());
		
	WebElement Desc = driver.findElement(By.xpath("(//div[@class='col-md-12'])[1]"));
	System.out.println("Description: " + Desc.getText());
	
	WebElement text = driver.findElement(By.xpath("(//div[@class='col-md-12'])[2]"));
	System.out.println("Sample Text: " + text.getText());
	
	driver.findElement(By.xpath("(//div[@class='col-md-12'])[3]")).click();
	
	WebElement textbox = driver.findElement(By.xpath("//input[@id='fname']"));
		//System.out.println("TextBox: " + textbox.getText());
	
	driver.findElement(By.xpath("//button[@id='idOfButton']")).click();
	//Radio button
	driver.findElement(By.xpath("//input[@id='female']")).click();
		
	//Checkbox
	WebElement ckbx=driver.findElement(By.xpath("(//div[@class='col-md-12'])[7]"));
	Select checkbox = new Select(ckbx);
	checkbox.selectByValue("Performance");
	
	//Dropdown
		WebElement dd=driver.findElement(By.id("testingDropdown"));
	Select dropdown = new Select(dd);
	checkbox.selectByValue("Performance");
	
	//Double click Alert box
	driver.findElement(By.xpath("//button[@id='dblClkBtn']")).click();
	
	//Alert box
	driver.findElement(By.xpath("(//div[@class='col-md-12'])[10]")).click();
		
	//Confirm Box
	driver.findElement(By.xpath("(//div[@class='col-md-12'])[11]")).click();
	
	//Drag and drop Box
		driver.findElement(By.xpath("(//div[@class='col-md-12'])[12]")).click();
	
	
	
	//driver.close();
	//driver.quit();
		
	}

}
