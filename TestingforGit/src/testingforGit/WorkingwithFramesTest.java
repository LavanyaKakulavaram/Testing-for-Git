package testingforGit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WorkingwithFramesTest {
	@Test
	public void test()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\aditi\\Desktop\\Drivers\\geckodriver.exe");
		//WebDriver driver= new FirefoxDriver();
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\aditi\\Desktop\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new FirefoxDriver();

		driver.get("http://demo.guru99.com/test/guru99home/");

		driver.manage().window().maximize();
		int size = driver.findElements(By.tagName("iframe")).size();
		
		System.out.println(size);
		
		driver.switchTo().frame("_mN_main_224278574_0_n");
		driver.findElement(By.linkText("Cyber Security Training")).click();
	
		

	}

}



