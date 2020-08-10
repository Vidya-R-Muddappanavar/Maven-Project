package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class DemoTest {
	static {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver.exe");
	}
	public static WebDriver driver;
	
	@BeforeTest
	@Parameters("sBrowser")
	public void openBrowser_02(String sBrowser)
	{
		if(sBrowser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(sBrowser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
	}
	
	@Test
	public void openApplication_03()
	{
		driver.get("http://localhost/login.do");
	}
	

	public void login_04() throws InterruptedException
	{
		WebElement un = driver.findElement(By.name("username"));
		un.sendKeys("admin");
		WebElement pw = driver.findElement(By.name("pwd"));
		pw.sendKeys("manager");
		WebElement keepLoggedInCheckBox=driver.findElement(By.id("keepLoggedInCheckBox"));
		keepLoggedInCheckBox.click();
		WebElement lgn = driver.findElement(By.id("loginButton"));
		lgn.click();
		Thread.sleep(1000);
	}
	
	public void closeApplication_05()
	{
		driver.close();
	}
	
	@Test
	public void Demo_test_01() throws InterruptedException
	{
		Reporter.log("from demotest",true);
		DemoTest a=new DemoTest();
		//a.openBrowser_02("chrome");
		driver.manage().window().maximize();
		a.openApplication_03();
		a.login_04();
		//Reporter.log("from demoootest",true);
		//a.closeApplication_05();
	}
}
