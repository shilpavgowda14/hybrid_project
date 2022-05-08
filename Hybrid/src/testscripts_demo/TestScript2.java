package testscripts_demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import generic.BaseClass;
import generic.Generic_readExcel;
import generic.Utility_Methods;
import pom_demo.Pom2;

public class TestScript2 extends BaseClass
{
	@Test
	public void test() throws EncryptedDocumentException, IOException, InterruptedException, AWTException
	{
		String firstName = Generic_readExcel.getData("Sheet1", 0, 0);
		String lastName = Generic_readExcel.getData("Sheet1", 1, 0);
		String emailId = Generic_readExcel.getData("Sheet1", 2, 0);
		String mNumber = Generic_readExcel.getData("Sheet1", 3, 0);
		
		Pom2 pc = new Pom2(driver);
			
		pc.first_name(firstName);			
		pc.last_name(lastName);			
		pc.email_id(emailId);		
		pc.gender();
		pc.number(mNumber);
		
		Thread.sleep(2000);
//		JavascriptExecutor js= (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,500)");
		
		// Using utility methods
		Utility_Methods.javascriptexe(driver)
			.executeScript("window.scrollBy(0,500)");
		wait.until(ExpectedConditions.visibilityOf(pc.birth_field));			
		pc.dob();
		
		
		WebElement month = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Utility_Methods.select_class(month).selectByVisibleText("March");
//		Select sel= new Select(month);
//		sel.selectByVisibleText("March"); // or by index or by value
//			
		WebElement year = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Utility_Methods.select_class(year).selectByVisibleText("1999");
//		Select sel1= new Select(year);
//		sel1.selectByVisibleText("1999");
		
		pc.date();
		Thread.sleep(2000);
			
		pc.subject();
		Thread.sleep(2000);
		
		Utility_Methods.keyboard_functions().keyPress(KeyEvent.VK_DOWN);
		Utility_Methods.keyboard_functions().keyPress(KeyEvent.VK_DOWN);		
		Utility_Methods.keyboard_functions().keyPress(KeyEvent.VK_TAB);
		Utility_Methods.keyboard_functions().keyPress(KeyEvent.VK_TAB);
		
		
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_TAB);
//		Thread.sleep(2000);
			
		pc.hobbies();
		Thread.sleep(2000);
			
		pc.picture();
		Thread.sleep(2000);
			
		pc.addr();
		Thread.sleep(2000);
		
		pc.state();
		Thread.sleep(2000);
		
		Utility_Methods.keyboard_functions().keyPress(KeyEvent.VK_DOWN);
		Utility_Methods.keyboard_functions().keyPress(KeyEvent.VK_DOWN);		
		Utility_Methods.keyboard_functions().keyPress(KeyEvent.VK_TAB);
		Utility_Methods.keyboard_functions().keyPress(KeyEvent.VK_TAB);
		
//		Robot r1 = new Robot();
//		r1.keyPress(KeyEvent.VK_DOWN);
//		r1.keyRelease(KeyEvent.VK_DOWN);
//		r1.keyPress(KeyEvent.VK_TAB);
//		r1.keyRelease(KeyEvent.VK_TAB);
			
		pc.city();
//		Thread.sleep(4000);
//		Robot r2 = new Robot();
//		r2.keyPress(KeyEvent.VK_DOWN);
//		r2.keyRelease(KeyEvent.VK_DOWN);
//		r2.keyPress(KeyEvent.VK_TAB);
//		r2.keyRelease(KeyEvent.VK_TAB);
		
		Utility_Methods.keyboard_functions().keyPress(KeyEvent.VK_DOWN);
		Utility_Methods.keyboard_functions().keyPress(KeyEvent.VK_DOWN);		
		Utility_Methods.keyboard_functions().keyPress(KeyEvent.VK_TAB);
		Utility_Methods.keyboard_functions().keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
			
//	    WebElement ele = driver.findElement(By.xpath("//button[.='Submit']"));
//		Actions act = new Actions(driver);
//		act.moveToElement(ele).click().per	form();
//		Thread.sleep(4000);
		Thread.sleep(2000);
		Utility_Methods.actions_perform(driver).moveToElement(pc.submit_btn);
		Thread.sleep(5000);
		
//		String text = driver.findElement(By.xpath("(//div[.='Thanks for submitting the form'])[2]")).getText();
		String text = "Thanks for submitting the form";
		Assert.assertEquals(text, "Thanks for Submitting Form");	
		System.out.println("Paassed");
		
			
	}
}
