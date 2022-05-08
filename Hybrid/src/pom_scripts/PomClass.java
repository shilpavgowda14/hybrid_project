package pom_scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.bouncycastle.jcajce.provider.symmetric.ARC4.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseClass;

public class PomClass extends BaseClass
{
	// Declaration
	@FindBy(id="firstName")
	private WebElement fname; // to give explicit wait in TestScript class
	
	@FindBy(id="lastName")
	private WebElement lname;

	@FindBy(id="userEmail")
	private WebElement email;
	
	@FindBy(xpath="//label[.='Female']")
	private WebElement female;
	
	@FindBy(xpath="//label[.='Male']")
	private WebElement male;
	
	@FindBy(xpath="//label[.='Other']")
	private WebElement other;
	
	@FindBy(id="userNumber")
	private WebElement number;
	
	@FindBy(id="dateOfBirthInput")
	private WebElement dob;
	
//	@FindBy(xpath="//div[@aria-label='Choose Saturday, May 14th, 2022']")
//	private WebElement dates;
	
	@FindBy(xpath="//div[.='14']")
	private WebElement dates;
	
//	@FindBy(id="subjectsContainer")
//	private WebElement subject;
	
	@FindBy(xpath="//input[@id='subjectsInput']")
	private WebElement subject;
	
	@FindBy(xpath="//label[.='Music']")
	private WebElement cbox;
	
	@FindBy(xpath="//label[.='Reading']")
	private WebElement cbox1;
	
	@FindBy(xpath="//label[.='Sports']")
	private WebElement cbox2;
	
	@FindBy(id="uploadPicture")
	private WebElement upload;
	
	@FindBy(id="currentAddress")
	private WebElement address;
	
	@FindBy(xpath="//div[.='Select State']")
	public WebElement state;
	
	@FindBy(id="city")
	private WebElement city;	
	
//	@FindBy(xpath="//button[.='Submit']")
//	public WebElement submitbtn;
	
	// Initialization
	public PomClass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// Utilization	
	public void fsname(String datafname) 
	{
		fname.sendKeys(datafname);
	}
	
	public void lsname(String datalname) 
	{
		lname.sendKeys(datalname);
	}
	
	public void mail(String dataemail) 
	{
		email.sendKeys(dataemail);
	}
	
	public void rfemale() 
	{
		female.click();
	}
	
	public void pnumber(String datanum) 
	{
		number.sendKeys(datanum);
	}
	
	public void date_birth() 
	{
		dob.click();
	}
	
	public void choosedate()
	{
		dates.click();
	}
	
	public void sub()
	{
		subject.sendKeys("C");
	}
	
	public void checkbox() 
	{
		cbox.click();
	}
	
	public void upload() 
	{
		upload.sendKeys("C:\\Users\\shilp\\Desktop\\Data.csv");
	}

	public void addrs() 
	{
		address.sendKeys("Bangalore");
	}

	public void states() 
	{
		state.click();
	}

	public void city() 
	{
		city.click();
	}

//	public void submit() 
//	{
//		submitbtn.click();
//	}
}
