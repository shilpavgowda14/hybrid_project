package test_scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.Generic_readExcel;
import pom_scripts.PomClass;

public class Test_Script extends BaseClass
{
	@Test
	public void test() throws EncryptedDocumentException, IOException, AWTException, InterruptedException
	{
		String firstName = Generic_readExcel.getData("Sheet1", 0, 0);
		String lastName = Generic_readExcel.getData("Sheet1", 1, 0);
		String emailId = Generic_readExcel.getData("Sheet1", 2, 0);
		String mNumber = Generic_readExcel.getData("Sheet1", 3, 0);
//		String subject1 = Generic_readExcel.getData("Sheet1", 4, 0);
//		String address = Generic_readExcel.getData("Sheet1", 5, 0);
//		String state = Generic_readExcel.getData("Sheet1", 6, 0);
//		String city = Generic_readExcel.getData("Sheet1", 7, 0);
		
		// Create object for PomClass
		PomClass p = new PomClass(driver);
		//wait.until(ExpectedConditions.visibilityOf(p.fname)); // classname.variable_name (static-to-static ----> between the classes)
		p.fsname(firstName);
		p.lsname(lastName);
		p.mail(emailId);
		p.rfemale();
		p.pnumber(mNumber);
		
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		p.date_birth();
		
		WebElement month = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		// Select class
		Select sel= new Select(month);
		sel.selectByVisibleText("March");
			
		WebElement year = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		// Select class
		Select sel1= new Select(year);
		sel1.selectByVisibleText("1999");
		
		p.choosedate();		
		Thread.sleep(5000);
		
		p.sub();
		Thread.sleep(2000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		

		p.checkbox();
		Thread.sleep(2000);
		
		p.upload();
		Thread.sleep(2000);
		
		p.addrs();
		Thread.sleep(2000);
		
		p.states();
//		Actions act = new Actions(driver);
//		act.moveToElement(p.state).sendKeys("U").build().perform();
		//Robot r2 = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		p.city();
//		Actions act1 = new Actions(driver);
//		act1.moveToElement(p.city).sendKeys("A").build().perform();
		//Robot r1 = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.xpath("//button[.='Submit']"));
		Actions act2 = new Actions(driver);
		act2.moveToElement(ele).click().perform();
		Thread.sleep(4000);
	}
}
