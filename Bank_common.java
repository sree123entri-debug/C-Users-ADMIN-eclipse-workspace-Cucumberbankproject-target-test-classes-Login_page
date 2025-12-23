package bank.common;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bank_common {

	public static WebDriver d;
	public static String browser="GC";
	public static void launchbrowser() {
		if (browser.equals("GC")) {
			d=new ChromeDriver();}
		else if (browser.equals("FF")) {
			d=new FirefoxDriver();
		}
		else if(browser.equals("EE"))
		{
			d=new EdgeDriver();
		}
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.manage().deleteAllCookies();
		
			
		}
	public static void closebrowser() throws Exception {
		Thread.sleep(3000);
		d.quit();
		
	}
	
	
}
