/*import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TestSelenium2{

String url = "https://fr.wikipedia.org/wiki/Wikip%C3%A9dia:Accueil_principal";

    public TestSelenium2(){
    }
   
    
    @Test
    public void petitTest(){
    	System.setProperty("webdriver.firefox.bin", "C:\\Users\\Formation\\Downloads\\FirefoxPortable\\FirefoxPortable.exe");
    	System.setProperty("webdriver.firefox.marionette","C:\\Users\\Formation\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get(url);
		WebElement champRecherche = driver.findElement(By.id("searchInput"));
		champRecherche.sendKeys("selenium");
		//driver.findElement(By.id("searchInput")).sendKeys("selenium");
		WebElement boutonRecherche = driver.findElement(By.id("searchButton"));
		boutonRecherche.click();
    	
    }
  }



*/