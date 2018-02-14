import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class TestSelenium{
	
	//String browser = "firefox";
	String browser = System.getProperty("navigateur");
	//String version = "57.0.4";
	//String version ="63.0.3239.132";
	String url = "https://fr.wikipedia.org/wiki/Wikip%C3%A9dia:Accueil_principal";
	WebDriver driver;

    public TestSelenium(){
    }
   
    
    @Test
    public void petitTest() throws MalformedURLException{
    	DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName(browser);
    	//System.setProperty("webdriver.firefox.bin", "C:\\Users\\Formation\\Downloads\\FirefoxPortable\\FirefoxPortable.exe");
    	//System.setProperty("webdriver.firefox.marionette","C:\\Users\\Formation\\Downloads\\geckodriver.exe");
		//capabilities.setVersion(version);
		capabilities.setPlatform(org.openqa.selenium.Platform.WINDOWS);
		
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
		driver.get(url);
		WebElement champRecherche = driver.findElement(By.id("searchInput"));
		champRecherche.sendKeys("selenium");
		//driver.findElement(By.id("searchInput")).sendKeys("selenium");
		WebElement boutonRecherche = driver.findElement(By.id("searchButton"));
		boutonRecherche.click();
    	
    }
  }



