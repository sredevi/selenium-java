package selenium.java;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MortgageCalculator {

	public static void main(String[] args) {
	WebDriver driver=MyLibrary.LaunchChrome("https://www.mortgagecalculator.org/");
    
	//Home Value
	driver.findElement(By.id("homeval")).clear();
	driver.findElement(By.id("homeval")).sendKeys("100000");
	
	//xpath with classname - //input[@name='param[homevalue]']
	//xpath with class and index- (//input[@class='right-cell'])[1]
	//xpath with label value //label[text()=' Home Value: ']
	
	//Loan Amount
	driver.findElement(By.xpath("//input[@id='downpayment']")).clear();
	driver.findElement(By.xpath("//input[@id='downpayment']")).click();
	driver.findElement(By.xpath("//input[@id='downpayment']")).sendKeys("20000");
	//MyLibrary.clearAndTypeValue(driver.findElement(By.name("param[downpayment]")),"20000");
	
	//Principal
	driver.findElement(By.xpath("//input[@name='param[principal]']")).clear();
	driver.findElement(By.xpath("//input[@name='param[principal]']")).click();
	driver.findElement(By.xpath("//input[@name='param[principal]']")).sendKeys("80000");
	
	//Interest Rate
	driver.findElement(By.xpath("(//input[@class='right-cell'])[4]")).clear();
	driver.findElement(By.xpath("(//input[@class='right-cell'])[4]")).click();
	driver.findElement(By.xpath("(//input[@class='right-cell'])[4]")).sendKeys("4.5");
	
	//Loan Term
	driver.findElement(By.xpath("//label[text()=' Loan Term: ']/following-sibling::input")).clear();
	driver.findElement(By.xpath("//label[text()=' Loan Term: ']/following-sibling::input")).click();
	driver.findElement(By.xpath("//label[text()=' Loan Term: ']/following-sibling::input")).sendKeys("30");
	
	//Start date
	WebElement startMonth=driver.findElement(By.name("param[start_month]"));
	Select selectStartMonth = new Select(startMonth);
	selectStartMonth.selectByVisibleText("Apr")	;
	driver.findElement(By.xpath("//input[@id='start_year']")).clear();
	driver.findElement(By.xpath("//input[@id='start_year']")).click();
	driver.findElement(By.xpath("//input[@id='start_year']")).sendKeys("2020");
	
	//Property Tax
	driver.findElement(By.xpath("//label[text()=' Property Tax: ']/following-sibling::input")).clear();
	driver.findElement(By.xpath("//label[text()=' Property Tax: ']/following-sibling::input")).click();
	driver.findElement(By.xpath("//label[text()=' Property Tax: ']/following-sibling::input")).sendKeys("1000");
	
	//PMI
	driver.findElement(By.xpath("(//input[@class='right-cell'])[8]")).clear();
	driver.findElement(By.xpath("(//input[@class='right-cell'])[8]")).click();
	driver.findElement(By.xpath("(//input[@class='right-cell'])[8]")).sendKeys("1.5");
		
	//Home Ins
	driver.findElement(By.xpath("(//input[@class='right-cell'])[9]")).clear();
	driver.findElement(By.xpath("(//input[@class='right-cell'])[9]")).click();
	driver.findElement(By.xpath("(//input[@class='right-cell'])[9]")).sendKeys("500");
	
	//Monthly HOA
	driver.findElement(By.xpath("(//input[@class='right-cell'])[10]")).clear();
	driver.findElement(By.xpath("(//input[@class='right-cell'])[10]")).click();
	driver.findElement(By.xpath("(//input[@class='right-cell'])[10]")).sendKeys("100");
	
	//LoanType
	WebElement LoanType=driver.findElement(By.name("param[milserve]"));
	Select SelectLoanType = new Select(LoanType);
	//SelectLoanType.selectByVisibleText("FHA");
	SelectLoanType.selectByIndex(1);
	//SelectLoanType.selectByValue("2")
		
	//Buy or Refi
	WebElement BOR=driver.findElement(By.name("param[refiorbuy]"));
	Select SelectBOR = new Select(BOR);
	//SelectBOR.selectByVisibleText("Buy");
	SelectBOR.selectByValue("1");
		
	//credit Rating
	WebElement CreditRate=driver.findElement(By.name("param[credit_rating]"));
	Select SelectCreditRate = new Select(CreditRate);
	SelectCreditRate.selectByIndex(1);
	
	//Calculate button
	driver.findElement(By.xpath("//input[@value='Calculate']")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//Display results
	WebElement monthlypayment=driver.findElement(By.xpath("//div[@class='repayment-block']//h3"));
	String mPay=monthlypayment.getText();
	System.out.println("Monthly Payment "+mPay);
	//driver.close();
	//driver.quit();	
    
	}

}
