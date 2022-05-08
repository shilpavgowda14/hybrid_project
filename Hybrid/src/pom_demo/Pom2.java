package pom_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseClass;

public class Pom2 extends BaseClass
{
	@FindBy(id="firstName")
	private WebElement fn;
	
	@FindBy(id="lastName")
	private WebElement ln;
	
	@FindBy(id="userEmail")
	private WebElement email;
	
	@FindBy(xpath="//label[.='Female']")
	private WebElement gen;
	
	@FindBy(id="userNumber")
	private WebElement num;
	
	@FindBy(id="dateOfBirthInput")
	public WebElement birth_field;
	
	@FindBy(xpath="//div[.='14']")
	private WebElement date;
	
	@FindBy(xpath="//input[@id='subjectsInput']")
	private WebElement sub;
	
	@FindBy(xpath="//label[.='Music']")
	private WebElement hobby;
	
	@FindBy(id="uploadPicture")
	private WebElement upload;
	
	@FindBy(id="currentAddress")
	private WebElement address;
	
	@FindBy(id="state")
	private WebElement state;
		
	@FindBy(id="city")
	private WebElement city;
	
	@FindBy(xpath="//button[.='Submit']")
	public WebElement submit_btn;
	
	/*@FindBy(id="google_ads_iframe_/21849154601,22343295815/Ad.Plus-Anchor_0")
	private WebElement i_frame;*/
	
	//initialization
	public Pom2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void first_name(String datafn)
	{
		fn.sendKeys(datafn);
	}
	
	public void last_name(String dataln)
	{
		ln.sendKeys(dataln);
	}
	
	public void email_id(String data_email)
	{
		email.sendKeys(data_email);
	}
	
	public void gender()
	{
		gen.click();
	}
	
	public void number(String data_no)
	{
		num.sendKeys(data_no);
	}
	
	public void dob()
	{
		birth_field.click();
	}
	
	public void date()
	{
		date.click();
	}
	
	public void subject()
	{
		sub.sendKeys("C");
	}
	
	public void hobbies()
	{
		hobby.click();
	}
	
	public void picture()
	{
		upload.sendKeys("C:\\Users\\shilp\\Desktop\\Data.csv");
	}
	
	public void addr()
	{
		address.sendKeys("Bangalore");
	}
	
	public void state()
	{
		state.click();
	}
	
	public void city( )
	{
		city.click();
	}	
}
