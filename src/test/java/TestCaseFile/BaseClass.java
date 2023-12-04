package TestCaseFile;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import UtilitiesFIle.ReadConfig;
public class BaseClass 
{	public static WebDriver driver;
	public static Logger log1;
	ReadConfig rq= new ReadConfig(); 
	String url=rq.geturl();
	String bro=rq.getbrowser();
	@BeforeClass
	void browserLaunch()
	{
		switch(bro.toLowerCase())
		{
		case "chrome":
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case "msedge":
			driver=new EdgeDriver();
			break;
		case "firefox": 
			driver=new FirefoxDriver();
			break;
		default:
			driver=null;
			break; 
		}
		log1=LogManager.getLogger("MyFirstProject");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	public void ScreenShot() throws Exception
	{
		File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Destination=new File("C:\\Users\\user\\eclipse-workspace\\MyFirstProject\\ScreenShot\\Report.png");
		FileUtils.copyFile(Source, Destination);
	}
	
	@AfterClass
	public void closeUp()
	{
		driver.close();
		driver.quit();
	}
	

}

