package selenium.java;
import org.testng.annotations.Test;
import selenium.java.library;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class RoughClass {

	public static void main(String[] args) {
		
		public class TestandQuiz {
			WebDriver driver;
			String originalTab;
			String newTab;
			@BeforeTest
			public void beforeTest() throws InterruptedException {
				System.out.println("I am running before test");
				driver = library.launchChrome("https://www.testandquiz.com/selenium/testing.html");
				originalTab = driver.getWindowHandle();
				System.out.println(originalTab);
				Thread.sleep(2000);
			}
			@Test
			public void automate() {
				// ?diffrent xpath version. ?how to open link in new tab.
				// driver.findElement(By.xpath("//a[text()=\"This is a
				// link\"]")).sendKeys(Keys.CONTROL +"t");
				originalTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
				driver.findElement(By.xpath("//a[text()=\"This is a link\"]")).sendKeys(originalTab);
				/*
				 * driver.findElement(By.xpath("//a[text()=\"This is a link\"]")).click();
				 * driver.switchTo().window(originalTab);
				 */
				System.out.println(originalTab + "ABC");
				driver.findElement(By.id("fname")).sendKeys("Deepali");
				// ? how to write xpath for title
				WebElement element = driver.findElement(By.id("idOfButton"));
				String str = element.getText();
				// ?how to find if the background color of the button was green ot to check any
				// other property
				driver.findElement(By.id("idOfButton")).click();
				driver.findElement(By.xpath("//input[@id=\"female\"]")).click();
				;
				// --//input[@type="checkbox"][1]
				driver.findElement(By.xpath("//input[@type='checkbox' and @value='Automation']")).click();
				// WebElement dropOption
				// =driver.findElement(By.id("manual"));------((//select[@id="testingDropdown"])/option[@id="manual"])
				new Select(driver.findElement(By.id("testingDropdown"))).selectByValue("Performance");// .selectByIndex(3);//Performance
				// Alert Box--dblClkBtn
				Actions action = new Actions(driver);
				action.doubleClick(driver.findElement(By.id("dblClkBtn"))).perform();
				Alert alert = driver.switchTo().alert();
				System.out.println("Alert Text\n" + alert.getText());
				alert.accept();
				// alert('hi, JavaTpoint Testing');
				Actions action1 = new Actions(driver);
				// -----//b[text()="Click button to generate Alert box : "]
				// driver.findElement(By.xpath("//b[text()=\"Click button to generate Alert box
				// : \"]")).click();
				// action1.click((WebElement) By.xpath("//b[text()=\"Click button to generate
				// Alert box : \"]"));
				System.out.println("end");
			}
			@AfterTest
			public void afterTest() {
			}
		}


	}

}
