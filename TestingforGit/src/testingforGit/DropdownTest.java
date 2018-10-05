package testingforGit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DropdownTest {
	
	@Test
public void test()
{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aditi\\Desktop\\Drivers\\chromedriver.exe");
		WebDriver web=new ChromeDriver();
		web.manage().window().maximize();
		web.get("https://www.facebook.com/");
		List<WebElement> it=web.findElements(By.tagName("a"));
		for(int i=0;i<it.size()-1;i++)
		{
			System.out.println(it.get(i).getText());
		}

	}
}
