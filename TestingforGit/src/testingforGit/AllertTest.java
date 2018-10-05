package testingforGit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AllertTest {
	@Test
	public void test()
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aditi\\Desktop\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/delete_customer.php");
	driver.manage().window().maximize();
	driver.findElement(By.name("cusid")).sendKeys("54446");
	driver.findElement(By.name("submit")).click();
	Alert art=driver.switchTo().alert();
	String allertMessage=driver.switchTo().alert().getText();
	art.accept();
	System.out.println("Allert Messageis : "+allertMessage);
	String AfterAccept=driver.switchTo().alert().getText();
	System.out.println("After Accept "+AfterAccept);
	art.accept();
	
	
	
	
	
	}

}

