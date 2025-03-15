package Academy;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BrowserTest {

	
	@Test
	public void getData() throws InterruptedException
	{
		System.out.println("Hello Guys");
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver =new ChromeDriver();
		System.out.println("PK Test");
		//driver.get("https://pktestacademy-fkfva8c0e8ambfgc.centralus-01.azurewebsites.net/webapp/");
		//String text =driver.findElement(By.cssSelector("h1")).getText();
		//System.out.println(text);
		//Assert.assertTrue(text.equalsIgnoreCase("RahulShettyAcademy.com Learning"));
		
		driver.close();
	
		
		
	}
}
