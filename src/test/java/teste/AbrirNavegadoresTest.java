package teste;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbrirNavegadoresTest {
		
	static WebDriver driver;
	
	@Test
	public void setUpBeforeClass() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("http://www.google.com.br");
		Assert.assertEquals("Google", driver.getTitle());
		
	}
	
}
