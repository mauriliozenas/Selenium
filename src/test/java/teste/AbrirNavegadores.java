package teste;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbrirNavegadores {
	 
	static WebDriver driver;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
	}
	
		
	@Test
	public void login() {
		//fail("Not yet implemented");
		WebElement login = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		login.click();
		
	}


	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		//driver.close();
		
		//driver.quit();
		
	}

	
}
