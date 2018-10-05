package testingforGit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Synchronization {
	
	@Test
	public void tedr()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aditi\\Desktop\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.PS.BRAND.hotels.HOTEL");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		        WebElement Dest = driver.findElement(By.id("H-destination"));

		        Dest.sendKeys("nyc");

		System.out.println("H-destination:"+Dest.getText());

		driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("H-fromDate")));

		driver.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);

		// driver.findElement(By.xpath("//a[contains(@href,'Orange-County-Hotels-Lemon')]")).click();

		

		System.out.println("Hotel Section:"+driver.getTitle());
	}

}
