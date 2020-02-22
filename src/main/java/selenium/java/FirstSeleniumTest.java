package selenium.java;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {

	public static void main(String[] args) {
		/* Automate search functionality in jcp.com home page
		 * 1. Open Chrome Browser
		 * 2. Goto JCP.com
		 * 3. Enter "shirts" in search text box
		 * 4. Click on search button
		 * 5. Verify the search results display
		 * 6. Close the browser
		 * 
		 * */
		// WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srede\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//Step #1
		ChromeDriver driver=new ChromeDriver();
		//Step #2
		driver.get("https://www.jcp.com");
		//Step #3&4 
		driver.findElementByName("Ntt").sendKeys("shirts" + Keys.ENTER);
		//Step #5
		String title=driver.getCurrentUrl();
		System.out.println("Title of the page: "+title);
		//Step #6
		driver.close();
		driver.quit();
	}

}
