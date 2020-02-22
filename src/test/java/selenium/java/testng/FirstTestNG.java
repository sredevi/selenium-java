package selenium.java.testng;

import org.testng.annotations.Test;

import selenium.java.MyLibrary;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class FirstTestNG {
  WebDriver driver;
  @Test
  public void myFirstTestcase(){
	  System.out.println("My First TestNG testcase");
	  driver=MyLibrary.LaunchChrome("https://letskodeit.teachable.com/p/practice");
	  driver.findElement(By.xpath("//input[@id='bmwradio']")).click();
	  
	//Select Class Example
		WebElement classeg=driver.findElement(By.xpath("//select[@name='cars']"));
		Select selectclasseg = new Select(classeg);
		selectclasseg.selectByValue("bmw");
		
	//Multiple Select Example
		WebElement slteg=driver.findElement(By.xpath("//select[@name='multiple-select-example']"));
		Select multipleslteg = new Select(slteg);
		multipleslteg.selectByValue("orange");
	
	//Multiple Checkbox Example
		WebElement selectcheckbox1=driver.findElement(By.xpath("(//input[@name='cars' and @type='checkbox'])[1]"));
		WebElement selectcheckbox2=driver.findElement(By.xpath("(//input[@name='cars' and @type='checkbox'])[2]"));
		selectcheckbox1.click();
		selectcheckbox2.click();
		 
  }
  
  @Test
  public void mySecondTestcase(){
	  System.out.println("My Second TestNG testcase");
	    }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Print this Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Print this After Test");
	 // driver.close();
  }

}
