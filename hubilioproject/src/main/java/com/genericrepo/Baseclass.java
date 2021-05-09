package com.genericrepo;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.objectrepo.Loginpage;

public class Baseclass
{
	public static WebDriver driver;
	datahandler dh = new datahandler();
	Loginpage lp =new Loginpage(driver);
	
	@BeforeSuite(alwaysRun = true)
	public void Bs()
	{
		System.out.println("=================================connect to db=========================");
	}
	
	@BeforeClass(alwaysRun = true)
	public void Bc() throws Exception
	{
		System.out.println("++++++++++++++++++++++launch the browser++++++++++++++++++++");
//		String browser =dh.getdatafromnotepad("browser");
//		if(browser.equals("chrome"))
//		{
//			 driver = new ChromeDriver();
//		}
//		else
//		{
//			driver = new FirefoxDriver();
//		}
		
	}
	@BeforeMethod(alwaysRun = true)
	public void Bm() throws Exception
	{
		System.out.println("login the application");
//		String url = dh.getdatafromnotepad("url");
//		String un = dh.getdatafromnotepad("username");
//		System.out.println(un);
//		String pwd = dh.getdatafromnotepad("password");
//		System.out.println(pwd);
//		driver.get(url);
//		lp.getUsername().sendKeys(un);
//		lp.getPasscode().sendKeys(pwd);
//		lp.getClick().click();
	}
	@AfterMethod(alwaysRun = true)
	public void am()
	{
		System.out.println("_________________________logout the application________________");
	}
	@AfterClass(alwaysRun = true)
	public void ac()
	{
		System.out.println("++++++++++++++++++++++++++close the browser+++++++++++++++++++");
	//	driver.close();
	}
	
	@AfterSuite(alwaysRun = true)
	public void as()
	{
		System.out.println("------------------------------close th db-------------------------");
	}
	
}
