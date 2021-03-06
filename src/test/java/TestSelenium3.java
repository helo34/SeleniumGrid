/*import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.commons.collections4.Get;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class TestSelenium3{
	
	String browser;
	String version;
	//String browser = "firefox";
	//String browser = "chrome";
	//String version = "57.0.4";
	//String version ="63.0.3239.132";
	String url = "https://fr.wikipedia.org/wiki/Wikip%C3%A9dia:Accueil_principal";
	WebDriver driver;

    public TestSelenium3(){
    }
   
    
    @Test
    public void petitTest() throws IOException{
    	InputStream stream = new FileInputStream("C:/Users/Formation/Desktop/navigateur.xlsx");
    	Workbook workbook = new XSSFWorkbook(stream); 
    	browser = workbook.getSheetAt(0).getRow(1).getCell(0).getStringCellValue();
    	version = workbook.getSheetAt(0).getRow(1).getCell(1).getStringCellValue();
    	
    	System.out.println(browser);
    	System.out.println(version);
    	for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
    		    		Sheet sheet = workbook.getSheetAt(i);
    		
    		for (Row row : sheet) {
    			for (Cell cell : row) {
    				System.out.println(cell.toString());
    			}
    		}
    	}
    	workbook.close();

    	
    	
    	DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName(browser);
    	//System.setProperty("webdriver.firefox.bin", "C:\\Users\\Formation\\Downloads\\FirefoxPortable\\FirefoxPortable.exe");
    	//System.setProperty("webdriver.firefox.marionette","C:\\Users\\Formation\\Downloads\\geckodriver.exe");
		capabilities.setVersion(version);
		capabilities.setPlatform(org.openqa.selenium.Platform.WINDOWS);
		
		driver = new RemoteWebDriver(new URL("http://192.168.56.1:4444/wd/hub"), capabilities);
		driver.get(url);
		WebElement champRecherche = driver.findElement(By.id("searchInput"));
		champRecherche.sendKeys("selenium");
		//driver.findElement(By.id("searchInput")).sendKeys("selenium");
		WebElement boutonRecherche = driver.findElement(By.id("searchButton"));
		boutonRecherche.click();
    	
    }


	public String getBrowser() {
		return this.browser;
	}


	public void setBrowser(String browser) {
		this.browser = browser;
	}


	public String getVersion() {
		return this.version;
	}


	public void setVersion(String version) {
		this.version = version;
	}
  }



*/