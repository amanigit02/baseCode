package KYC_PACK.basic_cmd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class second {
@Test
	public void testNG()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.8.0");
		driver.close();
	}
}
