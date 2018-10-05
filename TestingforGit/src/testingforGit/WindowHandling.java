package testingforGit;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandling {
	@Test
	public void tere()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aditi\\Desktop\\Drivers\\chromedriver.exe");
		WebDriver web=new ChromeDriver();
		web.manage().window().maximize();
		web.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		web.get("https://www.irctc.co.in");
		web.findElement(By.linkText("FLIGHTS")).click();
		//WebDriverWait wait=new WebDriverWait();
		System.out.println("The window ID is "+web.getWindowHandle());
		Set<String> st=web.getWindowHandles();
		
		Iterator<String> it=st.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
