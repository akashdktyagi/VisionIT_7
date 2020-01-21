package Window_Handling_SS;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Window_Handler_Example 
{
	
	@Test
	public void TestHandle()
	{
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		String parentwindowID= driver.getWindowHandle();
		System.out.println(parentwindowID);
		driver.findElement(By.xpath("//a[@target='_blank']")).click();
		Set<String> allwin = driver.getWindowHandles();
		System.out.println(allwin);
	//	driver.switchTo().window(parentwindowID);
		Iterator <String> IT= allwin.iterator();
		while(IT.hasNext())
		{
			String childwin=IT.next();
			if(!childwin.equalsIgnoreCase(parentwindowID));
			{
				driver.switchTo().window(parentwindowID);
			}
		}
		
	}
}
